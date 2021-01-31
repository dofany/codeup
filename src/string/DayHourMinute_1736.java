package string;

import java.util.Scanner;

public class DayHourMinute_1736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day,hour,minute,second;
        int n = sc.nextInt();
        day = n/ 86400;
        n -= 86400 * day;
        hour = n / 3600;
        n -= 3600 * hour;
        minute = n / 60;
        n -= 60*minute;
        second = n;

        System.out.print(day+" "+hour+" "+minute+" "+second+" ");


    }
}
