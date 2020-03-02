package arrays;

import java.util.Arrays;

public class p378_kth_smallest_element_in_a_sorted_matrix {
    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[][]{
                new int[]{1, 5, 9},
                new int[]{10, 11, 13},
                new int[]{12, 13, 15},
        }, 8));

//        System.out.println(kthSmallest(new int[][]{
//                new int[]{1, 2},
//                new int[]{1, 3},
//        }, 2));
    }
    // 17 ms
//    static int kthSmallest(int[][] matrix, int k) {
//        Queue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                q.offer(anInt);
//                if (q.size() > k) {
//                    q.poll();
//                }
//            }
//        }
//
//        return q.poll();
//    }

    // 6ms
    static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n * n];
        int x = 0;

        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                arr[x++] = ints[j];
            }
        }

        Arrays.sort(arr);
        return arr[k - 1];
    }
}
