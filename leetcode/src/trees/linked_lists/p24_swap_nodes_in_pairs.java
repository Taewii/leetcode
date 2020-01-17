package trees.linked_lists;

public class p24_swap_nodes_in_pairs {
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

        ListNode listNode = swapPairs(a5);
    }

    static ListNode swapPairs(ListNode head) {
        ListNode dummy = head.next;
        ListNode prev = head;

        while (head != null) {
            ListNode next = head.next;
            if (next != null) {
                prev.next = next;
                prev = head;
                head.next = next.next;
                next.next = head;
            }
            head = head.next;
        }

        return dummy == null ? prev : dummy;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
