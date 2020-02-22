package trees;

public class p1315_sum_of_nodes_with_even_valued_parents {
    static int sum = 0;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(6);
        TreeNode a2 = new TreeNode(7);
        TreeNode a3 = new TreeNode(8);
        TreeNode a4 = new TreeNode(2);
        TreeNode a5 = new TreeNode(7);
        TreeNode a6 = new TreeNode(1);
        TreeNode a7 = new TreeNode(3);
        TreeNode a8 = new TreeNode(9);
        TreeNode a9 = new TreeNode(1);
        TreeNode a10 = new TreeNode(4);
        TreeNode a11 = new TreeNode(5);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;
        a4.left = a8;
        a5.left = a9;
        a5.right = a10;
        a7.right = a11;

        System.out.println(sumEvenGrandparent(a1));
    }

    static int sumEvenGrandparent(TreeNode root) {
        helper(root, false);
        return sum;
    }

    private static void helper(TreeNode node, boolean even) {
        if (node == null) return;
        if (even) {
            if (node.left != null) sum += node.left.val;
            if (node.right != null) sum += node.right.val;
        }

        helper(node.left, node.val % 2 == 0);
        helper(node.right, node.val % 2 == 0);
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
