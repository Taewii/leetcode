package trees;

public class p235_lowest_common_ancestor_of_a_binary_search_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(6);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(8);
        TreeNode a4 = new TreeNode(0);
        TreeNode a5 = new TreeNode(4);
        TreeNode a6 = new TreeNode(7);
        TreeNode a7 = new TreeNode(9);
        TreeNode a8 = new TreeNode(3);
        TreeNode a9 = new TreeNode(5);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;
        a5.left = a8;
        a5.right = a9;

        System.out.println(lowestCommonAncestor(a1, a7, a6).val); // 8
        System.out.println(lowestCommonAncestor(a1, a2, a3).val); // 6
        System.out.println(lowestCommonAncestor(a1, a2, a5).val); // 2
        System.out.println(lowestCommonAncestor(a1, a6, a5).val); // 6
    }

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = root;
        int aVal = p.val;
        int bVal = q.val;

        while (true) {
            int val = root.val;
            if (val == aVal || val == bVal) break;
            if (val > aVal && val > bVal && root.left != null) {
                ans = root.left;
                root = root.left;
            } else if (val < aVal && val < bVal && root.right != null) {
                ans = root.right;
                root = root.right;
            } else {
                ans = root;
                break;
            }
        }

        return ans;
    }

    // a cleaner solution
//    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        while (root != null) {
//            if (root.val > p.val && root.val > q.val) {
//                root = root.left;
//            } else if (root.val < p.val && root.val < q.val) {
//                root = root.right;
//            } else {
//                return root;
//            }
//        }
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
