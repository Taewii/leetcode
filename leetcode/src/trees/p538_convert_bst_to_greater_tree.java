package trees;

public class p538_convert_bst_to_greater_tree {
    static int sum = 0;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(13);
        a1.left = a2;
        a1.right = a3;

        TreeNode node = convertBST(a1);
    }

    static TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    static void convert(TreeNode node) {
        if (node == null) return;

        convert(node.right);
        sum += node.val;
        node.val = sum;
        convert(node.left);
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
