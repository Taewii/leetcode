package trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class p437_path_sum_3 {
    static int paths = 0;

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(-3);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(2);
        TreeNode a6 = new TreeNode(11);
        TreeNode a7 = new TreeNode(3);
        TreeNode a8 = new TreeNode(-2);
        TreeNode a9 = new TreeNode(1);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.right = a6;
        a4.left = a7;
        a4.right = a8;
        a5.right = a9;

        System.out.println(pathSum(a1, 8));
    }

    // 11ms
    static int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            dfs(pop, sum, 0);
            if (pop.left != null) stack.push(pop.left);
            if (pop.right != null) stack.push(pop.right);
        }

        return paths;
    }

    static void dfs(TreeNode node, int target, int current) {
        if (node == null) return;
        if (current + node.val == target) paths++;

        dfs(node.left, target, current + node.val);
        dfs(node.right, target, current + node.val);
    }

    // fastest solution - 3ms
//    public int pathSum(TreeNode root, int sum) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, 1);
//        return helper(root, 0, sum, map);
//    }
//
//    public int helper(TreeNode root, int s, int sum, Map<Integer, Integer> map) {
//        if (root == null) return 0;
//        s += root.val;
//        int res = map.getOrDefault(s - sum, 0);
//        map.put(s, map.getOrDefault(s, 0) + 1);
//        res += helper(root.left, s, sum, map) + helper(root.right, s, sum, map);
//        map.put(s, map.get(s) - 1);
//        return res;
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
