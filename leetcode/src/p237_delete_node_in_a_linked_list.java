public class p237_delete_node_in_a_linked_list {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(5);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        deleteNode(a1);
    }

    // bruh...
    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
