package basic100;

import java.util.Scanner;

public class YearMonthDay_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] st = s.split("\\.");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);
        System.out.printf("%02d-%02d-%04d",c,b,a);
    }
}
