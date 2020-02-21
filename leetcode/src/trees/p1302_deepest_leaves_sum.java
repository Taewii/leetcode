package trees;

public class p1302_deepest_leaves_sum {
    static int maxSum = 0;
    static int maxDepth = 0;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(7);
        TreeNode a8 = new TreeNode(8);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.right = a6;
        a6.right = a8;
        a4.left = a7;

        System.out.println(deepestLeavesSum(a1));
    }

    public static int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return maxSum;
    }

    private static void dfs(TreeNode node, int depth) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            if (depth > maxDepth) {
                maxDepth = depth;
                maxSum = 0;
            }

            if (depth == maxDepth) maxSum += node.val;
        }

        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
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
