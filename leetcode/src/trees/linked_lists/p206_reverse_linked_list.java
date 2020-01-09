package trees.linked_lists;

public class p206_reverse_linked_list {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        ListNode listNode = reverseList(a1);
    }

    static ListNode reverseList(ListNode head) {
        ListNode dummy = null;

        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = dummy;
            dummy = node;
            head = head.next;
        }

        return dummy;
    }

//    static ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode cur = head;
//
//        while (cur != null) {
//            ListNode after = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = after;
//        }
//
//        return prev;
//    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
