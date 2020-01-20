package arrays;

public class p997_find_the_town_judge {
    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][]{new int[]{1, 2}}));
        System.out.println(findJudge(3, new int[][]{new int[]{1, 3}, new int[]{2, 3}}));
        System.out.println(findJudge(3, new int[][]{new int[]{1, 3}, new int[]{2, 3}, new int[]{3, 1}}));
    }

    static int findJudge(int n, int[][] trust) {
        int[] ppl = new int[n + 1];

        for (int[] pair : trust) {
            ppl[pair[0]]--;
            ppl[pair[1]]++;
        }

        int ans = -1;
        for (int i = 1; i < ppl.length; i++) {
            if (ppl[i] == n - 1) {
                if (ans != -1) return -1;
                ans = i;
            }
        }

        return ans;
    }
}
