public class p110_balanced_binary_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(2);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(3);
        TreeNode a6 = new TreeNode(4);
        TreeNode a7 = new TreeNode(4);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a3.right = a5;
        a5.right = a7;
        a4.left = a6;

        System.out.println(isBalanced(a1));
    }

    static boolean isBalanced(TreeNode root) {
        return dfs(root, 0) >= 0;
    }

    static int dfs(TreeNode node, int depth) {
        if (node == null) return depth;
        int left = dfs(node.left, depth + 1);
        int right = dfs(node.right, depth + 1);

        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right);
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
