public class p108_convert_sorted_array_to_binary_search_tree {
    public static void main(String[] args) {
        TreeNode node = sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    }

    static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return buildTree(nums, 0, nums.length - 1);
    }

    static TreeNode buildTree(int[] nums, int start, int end) {
        int middle = (start + end) / 2;
        int rootVal = nums[middle];
        TreeNode root = new TreeNode(rootVal);
        if (start < middle) root.left = buildTree(nums, start, middle - 1);
        if (middle < end) root.right = buildTree(nums, middle + 1, end);
        return root;
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
