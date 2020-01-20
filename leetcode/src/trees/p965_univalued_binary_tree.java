package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class p965_univalued_binary_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(2);
        TreeNode a4 = new TreeNode(2);
        TreeNode a5 = new TreeNode(2);
        TreeNode a6 = new TreeNode(2);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.right = a6;

        System.out.println(isUnivalTree(a1));
    }

    static boolean isUnivalTree(TreeNode root) {
        if (root == null) return false;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int val = root.val;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val != val) return false;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return true;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
