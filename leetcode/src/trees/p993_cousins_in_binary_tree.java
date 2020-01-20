package trees;

import java.util.LinkedList;
import java.util.Queue;

public class p993_cousins_in_binary_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a3.right = a5;

        System.out.println(isCousins(a1, 4, 5));
    }

    static boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean first = false;
            boolean second = false;

            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.val == x) first = true;
                if (node.val == y) second = true;

                if (node.left != null && node.right != null) {
                    if (node.left.val == x && node.right.val == y) return false;
                    if (node.left.val == y && node.right.val == x) return false;
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            if (first && second) return true;
        }

        return false;
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
