package arrays;

public class p846_hand_of_straights {
    public static void main(String[] args) {
        System.out.println(isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
        System.out.println(isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4));
    }

    // 37 ms - 72%
//    static boolean isNStraightHand(int[] hand, int W) {
//        Queue<Integer> pq = new PriorityQueue<>();
//        for (int card : hand) pq.add(card);
//
//        while (!pq.isEmpty()) {
//            int curr = pq.poll();
//            for (int i = 1; i < W; i++) {
//                if (!pq.remove(curr + i)) return false;
//            }
//        }
//
//        return true;
//    }

    // 2ms - 100%
    static boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;

        int[] counts = new int[W];
        for (int card : hand) {
            counts[card % W]++;
        }

        for (int count : counts) {
            if (count != hand.length / W) {
                return false;
            }
        }

        return true;
    }
}
