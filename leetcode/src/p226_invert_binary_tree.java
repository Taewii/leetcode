public class p226_invert_binary_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(7);
        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(3);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(9);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        TreeNode treeNode = invertTree(a1);
    }

    static TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    static void invert(TreeNode node) {
        if (node == null) return;
        TreeNode right = node.right;
        node.right = node.left;
        node.left = right;
        invert(node.right);
        invert(node.left);
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
