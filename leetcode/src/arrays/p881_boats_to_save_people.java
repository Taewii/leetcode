package arrays;

import java.util.Arrays;

public class p881_boats_to_save_people {
    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1, 2}, 3));
        System.out.println(numRescueBoats(new int[]{3, 2, 2, 1}, 3));
        System.out.println(numRescueBoats(new int[]{3, 5, 3, 4}, 5));
    }

    static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        int ans = 0;

        while (start <= end) {
            if (people[start] + people[end] <= limit) start++;
            end--;
            ans++;
        }

        return ans;
    }
}
