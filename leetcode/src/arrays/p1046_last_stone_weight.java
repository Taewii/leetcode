package arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class p1046_last_stone_weight {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        System.out.println(lastStoneWeight(new int[]{1, 1}));
    }

    static int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) queue.offer(stone);

        while (queue.size() > 1) {
            Integer a = queue.poll();
            Integer b = queue.poll();
            int diff = Math.abs(a - b);
            if (diff != 0) queue.offer(diff);
        }

        return queue.isEmpty() ? 0 : queue.peek();
    }
}
