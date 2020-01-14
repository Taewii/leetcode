package trees;

public class p897_increasing_order_search_tree {
    static TreeNode cur;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(6);
        TreeNode a4 = new TreeNode(2);
        TreeNode a5 = new TreeNode(4);
        TreeNode a6 = new TreeNode(8);
        TreeNode a7 = new TreeNode(1);
        TreeNode a8 = new TreeNode(7);
        TreeNode a9 = new TreeNode(9);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.right = a6;
        a4.left = a7;
        a6.left = a8;
        a6.right = a9;

        TreeNode treeNode = increasingBST(a1);
    }

    static TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }

    private static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);

        node.left = null;
        cur.right = node;
        cur = node;

        inorder(node.right);
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
