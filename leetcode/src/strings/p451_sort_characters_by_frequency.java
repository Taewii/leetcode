package strings;

import java.util.PriorityQueue;
import java.util.Queue;

public class p451_sort_characters_by_frequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("Aabb"));
        System.out.println(frequencySort(""));
        System.out.println(frequencySort("aaaa"));
        System.out.println(frequencySort("raaeaedere"));
    }

    static String frequencySort(String s) {
        int[] count = new int[123];
        for (char c : s.toCharArray()) count[c]++;

        Queue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) continue;
            pq.offer(new int[]{count[i], i});
        }

        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            int[] ints = pq.poll();
            for (int i = 0; i < ints[0]; i++) {
                ans.append((char) ints[1]);
            }
        }

        return ans.toString();
    }
}
