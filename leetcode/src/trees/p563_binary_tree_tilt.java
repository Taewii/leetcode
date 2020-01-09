package trees;

public class p563_binary_tree_tilt {
    static int tilt = 0;

    public static void main(String[] args) {
//        TreeNode a1 = new TreeNode(1);
//        TreeNode a2 = new TreeNode(2);
//        TreeNode a3 = new TreeNode(3);
//        a1.left = a2;
//        a1.right = a3;

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
        a2.right = a5;
        a4.left = a6;
        a4.right = a7;

        System.out.println(findTilt(a1));
    }

    static int findTilt(TreeNode root) {
        dfs(root);
        return tilt;
    }

    static int dfs(TreeNode node) {
        if (node == null) return 0;
        int right = dfs(node.right);
        int left = dfs(node.left);
        tilt += Math.abs(right - left);
        return node.val + left + right;
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
