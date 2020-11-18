package if_else;

import java.util.Scanner;

public class Fraction_1224 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();

        if(a/b > c/d)
            System.out.println(">");
        else if(a/b == c/d)
            System.out.println("=");
        else
            System.out.println("<");
    }
}
