package general;

import java.util.ArrayDeque;
import java.util.Queue;

public class p933_number_of_recent_calls {
    public static void main(String[] args) {
        RecentCounter r = new RecentCounter();
    }

    private static class RecentCounter {

        private Queue<Integer> queue;

        public RecentCounter() {
            this.queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.offer(t);
            while (queue.peek() < t - 3000) queue.poll();
            return queue.size();
        }
    }
}


