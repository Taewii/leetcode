package trees;

public class p112_path_sum {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);
        a1.left = a2;
        a2.left = a3;
        a3.left = a4;
        a4.left = a5;
        a5.left = a6;

        System.out.println(hasPathSum(a1, 6));
    }

    static boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root, sum, 0);
    }

    static boolean dfs(TreeNode node, int target, int sum) {
        if (node == null) return false;
        if (sum + node.val == target && node.left == null && node.right == null) {
            return true;
        }

        return dfs(node.left, target, sum + node.val) || dfs(node.right, target, sum + node.val);
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
