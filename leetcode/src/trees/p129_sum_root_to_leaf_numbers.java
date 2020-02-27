package trees;

public class p129_sum_root_to_leaf_numbers {
    static int total;
    static int current;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(9);
        TreeNode a3 = new TreeNode(0);
        TreeNode a4 = new TreeNode(5);
        TreeNode a5 = new TreeNode(1);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;

        System.out.println(sumNumbers(a1));
    }

    static int sumNumbers(TreeNode root) {
        dfs(root);
        return total;
    }

    private static void dfs(TreeNode node) {
        if (node == null) return;
        current = current * 10 + node.val;
        if (node.left == null && node.right == null) {
            total += current;
            current /= 10;
            return;
        }

        dfs(node.left);
        dfs(node.right);
        current /= 10;
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
