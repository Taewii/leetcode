package strings;

public class p551_student_attendance_record_1 {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
        System.out.println(checkRecord("PPPLL"));
    }

    static boolean checkRecord(String s) {
        if (s.contains("LLL")) return false;
        int a = s.indexOf("A");
        if (a == -1) return true;
        return s.indexOf("A", a + 1) == -1;
    }

    // without indexOf
//    static boolean checkRecord(String s) {
//        char[] chars = s.toCharArray();
//        int absents = 0;
//        int maxLates = 0;
//        int lates = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == 'A') absents++;
//            if (i > 0 && chars[i] == 'L' && chars[i - 1] == 'L') {
//                lates++;
//                if (lates > maxLates) maxLates = lates;
//            } else {
//                lates = 0;
//            }
//        }
//
//        return absents < 2 && maxLates < 2;
//    }
}
