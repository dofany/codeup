package Input_Output;

import java.util.Scanner;

public class Temperature_1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%.3f",(((float)9/5)*a)+32);
    }
}
