package arrays;

public class p744_find_smallest_letter_greater_than_target {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j'));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        char min = 'z';
        boolean found = false;

        for (char ch : letters) {
            if (ch > target && ch <= min) {
                min = ch;
                found = true;
            }
        }

        return found ? min : letters[0];
    }

    // forgot that the array is sorted...
//    static char nextGreatestLetter(char[] letters, char target) {
//        for (char c : letters)
//            if (c > target) return c;
//        return letters[0];
//    }
}
