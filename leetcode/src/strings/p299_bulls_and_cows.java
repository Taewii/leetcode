package strings;

public class p299_bulls_and_cows {
    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810"));
        System.out.println(getHint("1123", "0111"));
        System.out.println(getHint("1122", "1222"));
    }

//    static String getHint(String secret, String guess) {
//        int bulls = 0;
//        int cows = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < secret.length(); i++) {
//            char c = secret.charAt(i);
//            map.putIfAbsent(c, 0);
//            map.put(c, map.get(c) + 1);
//        }
//
//        for (int i = 0; i < secret.length(); i++) {
//            char sc = secret.charAt(i);
//            char gc = guess.charAt(i);
//            Integer gcCount = map.get(gc);
//
//            if (map.containsKey(gc)) {
//                if (sc == gc) {
//                    if (gcCount <= 0) cows--;
//                    bulls++;
//                } else if (gcCount > 0) {
//                    cows++;
//                }
//
//                map.put(gc, gcCount - 1);
//            }
//        }
//
//        return bulls + "A" + cows + "B";
//    }

    // cleaner and faster
    static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';

            if (s == g) {
                bulls++;
            } else {
                if (numbers[s] < 0) cows++;
                if (numbers[g] > 0) cows++;
                numbers[s]++;
                numbers[g]--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
