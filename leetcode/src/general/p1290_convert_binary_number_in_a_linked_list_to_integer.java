package general;

public class p1290_convert_binary_number_in_a_linked_list_to_integer {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(1);

        a.next = b;
        b.next = c;

        System.out.println(getDecimalValue(a));
    }

    static int getDecimalValue(ListNode head) {
        StringBuilder bin = new StringBuilder();

        while (head != null) {
            bin.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(bin.toString(), 2);
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
