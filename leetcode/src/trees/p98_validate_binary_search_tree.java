package trees;

public class p98_validate_binary_search_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(1);
        TreeNode a3 = new TreeNode(3);
        a1.left = a2;
        a1.right = a3;

        System.out.println(isValidBST(a1));
    }

    static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private static boolean helper(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;

        int val = node.val;
        if (min != null && val <= min) return false;
        if (max != null && val >= max) return false;

        return helper(node.left, min, val) && helper(node.right, val, max);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
