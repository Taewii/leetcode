import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class p637_average_of_levels_in_a_binary_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(15);
        TreeNode a4 = new TreeNode(6);
        TreeNode a5 = new TreeNode(20);
        a1.left = a2;
        a1.right = a3;
        a3.left = a4;
        a3.right = a5;

        System.out.println(averageOfLevels(a1));
    }

    static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> stack = new ArrayDeque<>();
        stack.offer(root);

        while (!stack.isEmpty()) {
            int size = stack.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = stack.poll();
                sum += node.val;
                if (node.left != null) stack.offer(node.left);
                if (node.right != null) stack.offer(node.right);
            }

            ans.add(sum / size);
        }

        return ans;
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
