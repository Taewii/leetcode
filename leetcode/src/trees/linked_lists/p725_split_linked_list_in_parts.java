package trees.linked_lists;

public class p725_split_linked_list_in_parts {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;

        ListNode[] listNodes = splitListToParts(a1, 5);

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);
        ListNode b4 = new ListNode(4);
        ListNode b5 = new ListNode(5);
        ListNode b6 = new ListNode(6);
        ListNode b7 = new ListNode(7);
        ListNode b8 = new ListNode(8);
        ListNode b9 = new ListNode(9);
        ListNode b10 = new ListNode(10);

        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = b6;
        b6.next = b7;
        b7.next = b8;
        b8.next = b9;
        b9.next = b10;

        ListNode[] listNodes1 = splitListToParts(b1, 3);
    }

    static ListNode[] splitListToParts(ListNode root, int k) {
        int count = 0;
        ListNode dummy = root;
        while (dummy != null) {
            count++;
            dummy = dummy.next;
        }

        int n = count / k;

        ListNode prev = root;
        ListNode[] ans = new ListNode[k];
        int idx = 0;

        // partitions that will have n + 1 nodes
        int extra = count % k;
        if (extra != 0) {
            while (prev != null && extra-- > 0) {
                ans[idx++] = prev;
                int size = 0;
                while (size++ < n && prev != null) {
                    prev = prev.next;
                }

                ListNode temp = prev == null ? null : prev.next;
                if (prev != null) prev.next = null;
                prev = temp;
            }
        }

        while (prev != null && idx < k) {
            ans[idx++] = prev;
            int size = 0;
            while (size++ < n - 1 && prev != null) {
                prev = prev.next;
            }

            ListNode temp = prev == null ? null : prev.next;
            if (prev != null) prev.next = null;
            prev = temp;
        }

        return ans;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
