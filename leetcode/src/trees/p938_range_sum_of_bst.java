package trees;

public class p938_range_sum_of_bst {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(15);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(7);
        TreeNode a6 = new TreeNode(18);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.right = a6;

        System.out.println(rangeSumBST(a1, 7, 15));
    }

    static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        int sum = 0;

        if (root.val >= L && root.val <= R) sum += root.val;
        if (root.val < R) sum += rangeSumBST(root.right, L, R);
        if (root.val > L) sum += rangeSumBST(root.left, L, R);

        return sum;
    }

    // iterative
//    static int rangeSumBST(TreeNode root, int L, int R) {
//        if (root == null) return 0;
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.add(root);
//
//        int sum = 0;
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            if (node.val <= R && node.val >= L) sum += node.val;
//            if (node.val < R && node.right != null) queue.offer(node.right);
//            if (node.val > L && node.left != null) queue.offer(node.left);
//        }
//
//        return sum;
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
