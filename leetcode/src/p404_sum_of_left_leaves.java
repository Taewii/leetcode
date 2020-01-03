public class p404_sum_of_left_leaves {
    static int sum = 0;

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

        System.out.println(sumOfLeftLeaves(a1));
    }

    static int sumOfLeftLeaves(TreeNode root) {
        dfs(root, false);
        return sum;
    }

    static void dfs(TreeNode node, boolean isLeft) {
        if (node == null) return;
        if (node.left == null && node.right == null && isLeft) sum += node.val;
        dfs(node.left, true);
        dfs(node.right, false);
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
