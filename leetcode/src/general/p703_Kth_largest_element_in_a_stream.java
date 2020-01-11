package general;

import java.util.PriorityQueue;
import java.util.Queue;

public class p703_Kth_largest_element_in_a_stream {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(3, arr);
        System.out.println(kthLargest.add(3)); // returns 4
        System.out.println(kthLargest.add(5)); // returns 5
        System.out.println(kthLargest.add(10)); // returns 5
        System.out.println(kthLargest.add(9)); // returns 8
        System.out.println(kthLargest.add(4)); // returns 8
    }

    private static class KthLargest {

        private final int k;
        private final Queue<Integer> queue;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            this.queue = new PriorityQueue<>();
            for (int num : nums) this.add(num);
        }

        public int add(int val) {
            queue.add(val);
            if (queue.size() == k + 1) {
                queue.remove();
            }
            return queue.peek();
        }
    }
}
