package trees;

import java.util.LinkedList;

public class p1022_sum_of_root_leaf_binary_numbers {
    static LinkedList<Integer> list = new LinkedList<>();
    static int total = 0;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(0);
        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(0);
        TreeNode a5 = new TreeNode(1);
        TreeNode a6 = new TreeNode(0);
        TreeNode a7 = new TreeNode(1);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        System.out.println(sumRootToLeaf(a1));
    }

    static int sumRootToLeaf(TreeNode root) {
        preorder(root);
        return total;
    }

    static void preorder(TreeNode node) {
        if (node == null) return;
        list.addLast(node.val);
        if (node.left == null && node.right == null) {
            int num = 0;
            for (Integer integer : list) {
                num = num * 2 + integer;
            }

            total += num;
        }

        preorder(node.left);
        preorder(node.right);
        list.removeLast();
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
