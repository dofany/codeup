package if_else;

import java.util.Scanner;

public class Calorie_1210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, cal1, cal2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num1 == 1) {
            cal1 = 400;
        } else if (num1 == 2) {
            cal1 = 340;
        } else if (num1 == 3) {
            cal1 = 170;
        } else if (num1 == 4) {
            cal1 = 100;
        } else {
            cal1 = 70;
        }

        if (num2 == 1) {
            cal2 = 400;
        } else if (num2 == 2) {
            cal2 = 340;
        } else if (num2 == 3) {
            cal2 = 170;
        } else if (num2 == 4) {
            cal2 = 100;
        } else {
            cal2 = 70;
        }

        if (cal1 + cal2 > 500) {
            System.out.println("angry");
        } else {
            System.out.println("no angry");
        }


    }
}
