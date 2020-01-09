package general;

public class p292_nim_game {
    public static void main(String[] args) {
        System.out.println(canWinNim(1));
        System.out.println(canWinNim(2));
        System.out.println(canWinNim(3));
        System.out.println(canWinNim(4));
    }

    static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
