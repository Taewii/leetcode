package arrays;

import java.util.Map;
import java.util.TreeMap;

public class p853_car_fleet {
    public static void main(String[] args) {
        System.out.println(carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
    }

    static int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> cars = new TreeMap<>();
        for (int i = 0; i < position.length; i++) {
            cars.put(-position[i], (double) (target - position[i]) / speed[i]);
        }

        int fleets = 0;
        double lastTime = 0;
        for (double time : cars.values()) {
            if (time > lastTime) {
                lastTime = time;
                fleets++;
            }
        }

        return fleets;
    }
}
