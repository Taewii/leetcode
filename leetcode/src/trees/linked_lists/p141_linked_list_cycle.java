package trees.linked_lists;

public class p141_linked_list_cycle {
    public static void main(String[] args) {

    }

    static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

//    static boolean hasCycle(ListNode head) {
//        Set<ListNode> nodes = new HashSet<>();
//        while (head != null) {
//            if (nodes.contains(head)) return true;
//            nodes.add(head);
//            head = head.next;
//        }
//
//        return false;
//    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}