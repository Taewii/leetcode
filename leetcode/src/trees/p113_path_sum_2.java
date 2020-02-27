package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class p113_path_sum_2 {
    static List<List<Integer>> ans = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(4);
        TreeNode a3 = new TreeNode(8);
        TreeNode a4 = new TreeNode(11);
        TreeNode a5 = new TreeNode(13);
        TreeNode a6 = new TreeNode(4);
        TreeNode a7 = new TreeNode(7);
        TreeNode a8 = new TreeNode(2);
        TreeNode a9 = new TreeNode(5);
        TreeNode a10 = new TreeNode(1);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a3.left = a5;
        a3.right = a6;
        a4.left = a7;
        a4.right = a8;
        a6.left = a9;
        a6.right = a10;

        System.out.println(pathSum(a1, 22));
    }

    static List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, 0, sum);
        return ans;
    }

    private static void dfs(TreeNode node, int current, int sum) {
        if (node == null) return;

        int val = current + node.val;
        if (val == sum && node.left == null && node.right == null) {
            path.add(node.val);
            ans.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }

        path.add(node.val);
        dfs(node.left, val, sum);
        dfs(node.right, val, sum);
        path.removeLast();
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
