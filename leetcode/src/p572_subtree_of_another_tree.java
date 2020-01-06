public class p572_subtree_of_another_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(4);
        TreeNode a3 = new TreeNode(5);
        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(2);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
//        a5.left = new TreeNode(0);

        TreeNode b1 = new TreeNode(4);
        TreeNode b2 = new TreeNode(1);
        TreeNode b3 = new TreeNode(2);

        b1.left = b2;
        b1.right = b3;

        System.out.println(isSubtree(a1, null));
    }

    static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;

        return ((s.val == t.val) && isSubtree(s.left, t.left) && isSubtree(t.right, s.right))
                || isSubtree(s.left, t) || isSubtree(s.right, t);
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
