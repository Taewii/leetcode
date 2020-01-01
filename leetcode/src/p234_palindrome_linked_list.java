public class p234_palindrome_linked_list {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        System.out.println(isPalindrome(a1));
    }

    static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode node = null; // reverse first half
        while (slow != null) {
            ListNode nxt = slow.next;
            slow.next = node;
            node = slow;
            slow = nxt;
        }

        while (node != null) {
            if (node.val != head.val) {
                return false;
            }
            node = node.next;
            head = head.next;
        }

        return true;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
