public class p203_remove_linked_list_elements {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        ListNode listNode = removeElements(a1, 2);
    }

    static ListNode removeElements(ListNode head, int val) {
        ListNode prev = head;
        ListNode current = head;

        while (current != null) {
            boolean sameVal = current.val == val;

            if (sameVal && current == prev) {
                head = current.next;
                current = head;
                prev = head;
                continue;
            } else if (sameVal && current.next != null) {
                prev.next = current.next;
                current = current.next;
                continue;
            } else if (sameVal) {
                prev.next = null;
            }

            prev = current;
            current = current.next;
        }

        return head;
    }

    static ListNode removeElements2(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        while (head != null) {
            if (head.val != val) {
                p.next = head;
                p = p.next;
            }
            head = head.next;
        }

        p.next = null;
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
