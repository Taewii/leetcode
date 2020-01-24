package arrays;

import java.util.Arrays;

public class p1103_distribute_candies_to_people {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(distributeCandies(7, 4)));
        System.out.println(Arrays.toString(distributeCandies(10, 3)));
    }

    static int[] distributeCandies(int candies, int ppl) {
        int[] people = new int[ppl];

        for (int i = 0; candies > 0; candies -= i) {
            people[i % ppl] += Math.min(candies, ++i);
        }

        return people;
    }
}
