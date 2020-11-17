package if_else;

import java.util.Scanner;

public class HalfPast_1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b < 60 && b >= 30) {

            System.out.print(a + " ");
            System.out.print(b - 30);

        } else if (a == 0 || b < 60 && b >= 30) {
            a = 23;
            System.out.print(a + " ");
            b += 30;
            System.out.print(b);
        } else {
            a -= 1;
            System.out.print(a + " ");
            b += 30;
            System.out.print(b);

        }

    }
}
