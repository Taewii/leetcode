package strings;

public class p657_robot_return_to_origin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }

    // @formatter:off
    static boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();

        int mv = 0;
        for (char ch : chars) {
            switch(ch) {
                case 'U': mv += 2; break;
                case 'R': mv++; break;
                case 'D': mv -= 2; break;
                case 'L': mv--; break;
            }
        }

        return mv == 0;
    }
    // @formatter:on
}
