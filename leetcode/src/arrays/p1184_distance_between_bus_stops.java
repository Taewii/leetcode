package arrays;

public class p1184_distance_between_bus_stops {
    public static void main(String[] args) {
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 2, 3));
    }

    static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int res = 0;
        int total = 0;

        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                res += distance[i];
            }
            total += distance[i];
        }

        return Math.min(res, total - res);
    }
}
