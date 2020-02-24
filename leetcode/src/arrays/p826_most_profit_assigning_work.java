package arrays;

import java.awt.*;
import java.util.Arrays;

public class p826_most_profit_assigning_work {
    public static void main(String[] args) {
        System.out.println(maxProfitAssignment(
                new int[]{2, 4, 6, 8, 10},
                new int[]{10, 20, 30, 40, 50},
                new int[]{4, 5, 6, 7}));
    }

    static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = profit.length;
        Point[] jobs = new Point[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Point(difficulty[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> a.x - b.x);
        Arrays.sort(worker);

        int ans = 0;
        int idx = 0;
        int best = 0;

        for (int skill : worker) {
            while (idx < n && skill >= jobs[idx].x) {
                best = Math.max(best, jobs[idx].y);
                idx++;
            }

            ans += best;
        }

        return ans;
    }
}
