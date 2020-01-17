package trees.linked_lists;

public class p19_remove_nth_node_from_end_of_list {
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

        ListNode listNode = removeNthFromEnd(a1, 2);
    }

//    static ListNode removeNthFromEnd(ListNode head, int n) {
//        List<ListNode> nodes = new ArrayList<>();
//
//        while (head != null) {
//            nodes.add(head);
//            head = head.next;
//        }
//
//        int len = nodes.size();
//        if (len - (n + 1) < 0) return len == 1 ? null : nodes.get(1);
//        ListNode prev = nodes.get(len - (n + 1));
//        ListNode next = len - (n - 1) >= len ? null : nodes.get(len - (n - 1));
//
//        prev.next = next;
//        return nodes.get(0);
//    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
