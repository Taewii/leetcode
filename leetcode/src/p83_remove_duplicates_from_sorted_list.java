public class p83_remove_duplicates_from_sorted_list {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(1);
        ListNode a5 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(1);
        ListNode b3 = new ListNode(2);
        ListNode b4 = new ListNode(3);
        ListNode b5 = new ListNode(3);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;

        ListNode node = deleteDuplicates(b1);
    }

    static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            while (next != null && next.val == cur.val) {
                next = next.next;
            }
            cur.next = next;
            cur = cur.next;
        }

        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
