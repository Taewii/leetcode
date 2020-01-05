import java.util.Arrays;

public class p506_relative_ranks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5, 4, 3, 2, 1})));
    }

    // @formatter:off
    static String[] findRelativeRanks(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        String[] ranks = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int rank = nums.length - Arrays.binarySearch(sorted, nums[i]);
            switch (rank) {
                case 1: ranks[i] = "Gold Medal"; break;
                case 2: ranks[i] = "Silver Medal"; break;
                case 3: ranks[i] = "Bronze Medal"; break;
                default: ranks[i] = String.valueOf(rank); break;
            }
        }

        return ranks;
    }
    // @formatter:on
}
