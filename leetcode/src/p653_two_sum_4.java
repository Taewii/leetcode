import java.util.HashSet;
import java.util.Set;

public class p653_two_sum_4 {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(6);
        TreeNode a4 = new TreeNode(2);
        TreeNode a5 = new TreeNode(4);
        TreeNode a6 = new TreeNode(7);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.right = a6;

        System.out.println(findTarget(a1, 5));
    }

    static boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return search(root, k, set);
    }

    static boolean search(TreeNode node, int target, Set<Integer> set) {
        if (node == null) return false;
        if (set.contains(target - node.val)) return true;
        set.add(node.val);
        return search(node.left, target, set) || search(node.right, target, set);
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
