package trees;

import java.util.*;

public class p102_binary_tree_zig_zag_level_order_traversal {
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

        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();

            LinkedList<Integer> list = new LinkedList<>();
            while (size-- > 0) {
                TreeNode node = q.poll();

                if (level % 2 != 0) {
                    list.addFirst(node.val);
                } else list.add(node.val);

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            level++;
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
