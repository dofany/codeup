package if_else;

import java.util.Scanner;

public class HalfPast_1174 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a += 24;
        b = b + a * 60;
        b -= 30;
        a = b/60;
        a = a %24;
        b = b %60;
        System.out.print(a + " ");
        System.out.print(b);
    }
}
