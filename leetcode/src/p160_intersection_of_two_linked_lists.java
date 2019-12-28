public class p160_intersection_of_two_linked_lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    // hash table
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> nodes = new HashSet<>();
//
//        while (headA != null) {
//            nodes.add(headA);
//            headA = headA.next;
//        }
//
//        while (headB != null) {
//            if (nodes.contains(headB)) return headB;
//            headB = headB.next;
//        }
//
//        return null;
//    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
