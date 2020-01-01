import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class p257_binary_tree_paths {
    public static void main(String[] args) {
//        TreeNode a1 = new TreeNode(1);
//        TreeNode a2 = new TreeNode(2);
//        TreeNode a3 = new TreeNode(3);
//        TreeNode a4 = new TreeNode(5);
//        a1.left = a2;
//        a1.right = a3;
//        a2.left = a4;

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

        List<String> result = binaryTreePaths(a1);
    }

    // 3ms solution
    static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        dfs(root, ans, list);
        return ans;
    }

    static void dfs(TreeNode node, List<String> ans, LinkedList<String> list) {
        if (node == null) return;
        list.addLast(String.valueOf(node.val));
        if (node.left == null && node.right == null) {
            ans.add(String.join("->", list));
        }

        dfs(node.left, ans, list);
        dfs(node.right, ans, list);
        list.removeLast();
    }

    // 1ms solution, same memory
//    static List<String> binaryTreePaths(TreeNode root) {
//        List<String> results = new LinkedList<>();
//        if (root == null) {
//            return results;
//        }
//        helper(root, results, "");
//        return results;
//    }
//
//    static void helper(TreeNode root, List<String> results, String path) {
//        if (root == null) {
//            return;
//        }
//        if (root.left == null && root.right == null) {
//            results.add(path + root.val);
//            return;
//        }
//        path += root.val + "->";
//        helper(root.left, results, path);
//        helper(root.right, results, path);
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
