package arrays;

public class p1343_number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold {
    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
        System.out.println(numOfSubarrays(new int[]{1, 1, 1, 1, 1}, 1, 0));
        System.out.println(numOfSubarrays(new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3}, 3, 5));
    }

    static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int ans = sum / k >= threshold ? 1 : 0;
        for (int i = 0; i < arr.length - k; i++) {
            sum -= arr[i];
            sum += arr[i + k];
            if (sum / k >= threshold) {
                ans++;
            }
        }

        return ans;
    }
}
