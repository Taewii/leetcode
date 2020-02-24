package trees;

public class p814_binary_tree_pruning {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(0);
        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(0);
        TreeNode a5 = new TreeNode(0);
        TreeNode a6 = new TreeNode(0);
        TreeNode a7 = new TreeNode(1);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        TreeNode treeNode = pruneTree(a1);
    }

    static TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null) return null;
        return root;
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
