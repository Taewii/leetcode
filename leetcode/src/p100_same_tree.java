import java.util.ArrayDeque;
import java.util.Deque;

public class p100_same_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(1);
        a1.left = a2;
        a1.right = a3;

        TreeNode b1 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode b3 = new TreeNode(1);
        b1.left = b2;
        b1.right = b3;

        System.out.println(isSameTree(a1, b1));
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        Deque<TreeNode> s = new ArrayDeque<>();
        TreeNode a = p;
        TreeNode b = q;

        while (a != null || b != null || s.size() > 0) {
            while (a != null && b != null) {
                if (a.val != b.val) return false;
                s.push(a);
                s.push(b);
                a = a.left;
                b = b.left;
            }

            if (a != null || b != null) return false;
            if (s.isEmpty()) return false;

            a = s.pop();
            b = s.pop();
            a = a.right;
            b = b.right;
        }

        return true;
    }

    // recursive
//    static boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null) return true;
//        if (p == null || q == null) return false;
//        if (p.val != q.val) return false;
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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


