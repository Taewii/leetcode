public class p21_merge_two_sorted_lists {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;

        ListNode node = mergeTwoLists(null, b1);
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;

        return dummy.next;
    }

//    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(-1);
//        ListNode cur = dummy;
//
//        while (l1 != null || l2 != null) {
//            while (l1 != null) {
//                if (l2 != null && l2.val < l1.val) {
//                    break;
//                }
//                cur.next = new ListNode(l1.val);
//                cur = cur.next;
//                l1 = l1.next;
//            }
//
//            while (l2 != null) {
//                if (l1 != null && l1.val < l2.val) {
//                    break;
//                }
//                cur.next = new ListNode(l2.val);
//                cur = cur.next;
//                l2 = l2.next;
//            }
//        }
//
//        return dummy.next;
//    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

