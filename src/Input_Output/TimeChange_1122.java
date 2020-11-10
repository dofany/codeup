package Input_Output;

import java.util.Scanner;

public class TimeChange_1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%60;
        System.out.printf("%d %d",a/60,b);
    }
}
