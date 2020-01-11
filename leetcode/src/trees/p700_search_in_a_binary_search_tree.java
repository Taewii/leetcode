package trees;

public class p700_search_in_a_binary_search_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(15);
        TreeNode a4 = new TreeNode(6);
        TreeNode a5 = new TreeNode(20);
        a1.left = a2;
        a1.right = a3;
        a3.left = a4;
        a3.right = a5;

        TreeNode treeNode = searchBST(a1, 5);
    }

    static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (val > root.val) return searchBST(root.right, val);
        return searchBST(root.left, val);
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
