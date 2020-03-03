package general;

public class p1342_number_of_steps_to_reduce_a_number_to_zero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(123));
    }

    static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num--;
            count++;
        }

        return count;
    }
}
