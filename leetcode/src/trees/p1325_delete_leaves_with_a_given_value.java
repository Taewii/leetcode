package trees;

public class p1325_delete_leaves_with_a_given_value {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(2);
        TreeNode a5 = new TreeNode(2);
        TreeNode a6 = new TreeNode(4);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a3.left = a5;
        a3.right = a6;

        TreeNode treeNode = removeLeafNodes(a1, 2);
    }

    static TreeNode removeLeafNodes(TreeNode root, int target) {
        postorder(root, root, true, target);
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }

    private static void postorder(TreeNode node, TreeNode parent, boolean left, int target) {
        if (node == null) return;

        postorder(node.left, node, true, target);
        postorder(node.right, node, false, target);

        if (node.left == null && node.right == null && node.val == target) {
            if (left) parent.left = null;
            else parent.right = null;
        }
    }

    // simpler and cleaner solution
//    static TreeNode removeLeafNodes(TreeNode root, int target) {
//        if (root == null) return null;
//        root.left = removeLeafNodes(root.left, target);
//        root.right = removeLeafNodes(root.right, target);
//        if (root.left == null && root.right == null && root.val == target) return null;
//        return root;
//    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
