package general;

public class p991_broken_calculator {
    public static void main(String[] args) {
        System.out.println(brokenCalc(432, 135930));
    }

    static int brokenCalc(int X, int Y) {
        int ans = 0;

        while (Y > X) {
            if (Y % 2 == 1) Y++;
            else Y /= 2;
            ans++;
        }

        return ans + X - Y;
    }
}
