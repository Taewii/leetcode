package trees.linked_lists;

public class p817_linked_list_components {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(3);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        System.out.println(numComponents(a1, new int[]{0, 1, 3}));
    }

    static int numComponents(ListNode head, int[] G) {
        boolean[] set = new boolean[10000];
        for (int num : G) set[num] = true;

        int ans = 0;
        while (head != null) {
            if (set[head.val] && (head.next == null || !set[head.next.val])) {
                ans++;
            }

            head = head.next;
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

