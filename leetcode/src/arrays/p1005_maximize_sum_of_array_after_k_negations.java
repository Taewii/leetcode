package arrays;

import java.util.Arrays;

public class p1005_maximize_sum_of_array_after_k_negations {
    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
        System.out.println(largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
        System.out.println(largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
    }

    // 2ms
    static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int idx = 0;
        while (k-- > 0) {
            nums[idx] *= -1;
            if (idx < nums.length - 1 && (nums[idx] > nums[idx + 1] || nums[idx + 1] < 0)) idx++;
        }

        int sum = 0;
        for (int num : nums) sum += num;

        return sum;
    }

    // clever solution with min heap, but a bit slower - 5ms
//    static int largestSumAfterKNegations(int[] nums, int k) {
//        Queue<Integer> queue = new PriorityQueue<>();
//
//        for (int num : nums) queue.offer(num);
//        while (k-- > 0) queue.offer(-queue.poll());
//
//        int sum = 0;
//        while (!queue.isEmpty()) sum += queue.poll();
//
//        return sum;
//    }
}
