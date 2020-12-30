package basic100;

import java.util.Scanner;

public class StorageCapacity_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();
        double result = h*b*c*s;
        double result1 = result/(8*1024*1024);
        System.out.printf("%.1f MB",result1);
    }
}
