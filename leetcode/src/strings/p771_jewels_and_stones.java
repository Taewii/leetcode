package strings;

public class p771_jewels_and_stones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    static int numJewelsInStones(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();

        int total = 0;
        int[] map = new int[123];
        for (char ch : stones) map[ch]++;
        for (char ch : jewels) total += map[ch];

        return total;
    }
}
