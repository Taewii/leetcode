package trees.linked_lists;

import java.util.Deque;
import java.util.LinkedList;

public class p143_reorder_list {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        reorderList(a1);
    }

    static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        Deque<ListNode> stack = new LinkedList<>();
        ListNode dummy = head;
        while (dummy != null) {
            stack.push(dummy);
            dummy = dummy.next;
        }

        int count = (stack.size() - 1) / 2;
        while (count-- > 0) {
            ListNode pop = stack.pop();
            ListNode tmp = head.next;
            head.next = pop;
            pop.next = tmp;
            head = tmp;
        }

        ListNode last = stack.pop();
        last.next = null;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
