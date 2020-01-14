package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class p872_leaft_similar_trees {
    static Queue<Integer> seq = new ArrayDeque<>();
    static boolean equal = true;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(6);
        TreeNode a5 = new TreeNode(2);
        TreeNode a6 = new TreeNode(9);
        TreeNode a7 = new TreeNode(8);
        TreeNode a8 = new TreeNode(7);
        TreeNode a9 = new TreeNode(4);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;
        a5.left = a8;
        a5.right = a9;

        System.out.println(leafSimilar(a1, a1));
    }

    static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        postOrder(root1, false);
        postOrder(root2, true);
        return equal;
    }

    static void postOrder(TreeNode node, boolean check) {
        if (node == null || !equal) return;
        if (node.left == null && node.right == null) {
            if (check) {
                if (seq.poll() != node.val) {
                    equal = false;
                }
            } else {
                seq.offer(node.val);
            }
            return;
        }

        postOrder(node.left, check);
        postOrder(node.right, check);
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
