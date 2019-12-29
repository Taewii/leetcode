import java.util.Arrays;

public class p169_majority_element {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 1, 1, 2, 2}));
    }

    // sorting
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // hashtable
//    static int majorityElement(int[] nums) {
//        Map<Integer, Integer> count = new TreeMap<>((a, b) -> Integer.compare(b, a));
//
//        for (int num : nums) {
//            count.putIfAbsent(num, 0);
//            count.put(num, count.get(num) + 1);
//        }
//
//        return count.entrySet().stream().min((a, b) -> b.getValue() - a.getValue()).get().getKey();
//    }
}
