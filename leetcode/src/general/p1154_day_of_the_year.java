package general;

public class p1154_day_of_the_year {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
        System.out.println(dayOfYear("2003-03-01"));
        System.out.println(dayOfYear("2004-03-01"));
        System.out.println(dayOfYear("2016-02-29"));
        System.out.println(dayOfYear("1976-01-24"));
    }

    static int dayOfYear(String date) {
        String[] params = date.split("-");
        int year = Integer.parseInt(params[0]);
        int month = Integer.parseInt(params[1]);
        int day = Integer.parseInt(params[2]);

        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        // leap year check
        if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            monthDays[2] = 29;
        }

        for (int i = 0; i < month; i++) {
            totalDays += monthDays[i];
        }

        return totalDays + day;
    }
}
