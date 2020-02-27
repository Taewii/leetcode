package arrays;

public class p134_gas_station {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
        System.out.println(canCompleteCircuit(new int[]{5, 8, 2, 8}, new int[]{6, 5, 6, 6}));
    }

    static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = cost.length;
        int start = 0;
        int total = 0;
        int subSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            total += gas[i] - cost[i];
            if (total < subSum) {
                subSum = total;
                start = i + 1;
            }
        }

        return total < 0 ? -1 : start % n;
    }
}
