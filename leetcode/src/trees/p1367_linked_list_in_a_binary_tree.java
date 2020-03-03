package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class p1367_linked_list_in_a_binary_tree {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(4);
        TreeNode a3 = new TreeNode(4);
        TreeNode a4 = new TreeNode(2);
        TreeNode a5 = new TreeNode(2);
        TreeNode a6 = new TreeNode(1);
        TreeNode a7 = new TreeNode(6);
        TreeNode a8 = new TreeNode(8);
        TreeNode a9 = new TreeNode(1);
        TreeNode a10 = new TreeNode(3);

        a1.left = a2;
        a2.right = a4;
        a4.left = a6;
        a1.right = a3;
        a3.left = a5;
        a5.left = a7;
        a5.right = a8;
        a8.left = a9;
        a8.right = a10;

        ListNode b1 = new ListNode(4);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(8);

        b1.next = b2;
        b2.next = b3;

        System.out.println(isSubPath(b1, a1));
    }

    static boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null || root == null) return false;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.val == head.val && check(head, node)) return true;
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }

        return false;
    }

    private static boolean check(ListNode listNode, TreeNode treeNode) {
        if (listNode == null) return true;
        if (treeNode == null || listNode.val != treeNode.val) return false;

        boolean left = check(listNode.next, treeNode.left);
        boolean right = check(listNode.next, treeNode.right);
        return left || right;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
