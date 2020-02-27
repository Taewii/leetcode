package trees;

public class p114_flatten_binary_tree_to_linked_list {
    static TreeNode prev = null;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(4);
        TreeNode a6 = new TreeNode(6);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.right = a6;

        flatten(a1);
    }

    static void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
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
