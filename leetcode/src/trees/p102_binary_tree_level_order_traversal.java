package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class p102_binary_tree_level_order_traversal {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(9);
        TreeNode a3 = new TreeNode(20);
        TreeNode a4 = new TreeNode(15);
        TreeNode a5 = new TreeNode(7);

        a1.left = a2;
        a1.right = a3;
        a3.left = a4;
        a3.right = a5;

        System.out.println(levelOrder(a1));
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();

            List<Integer> list = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            ans.add(list);
        }

        return ans;
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
