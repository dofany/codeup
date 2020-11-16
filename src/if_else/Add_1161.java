package if_else;

import java.util.Scanner;

public class Add_1161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a+b;

        if(a%2==0) {
            System.out.print("짝수");
        }
        else {
            System.out.print("홀수");
        }
        System.out.print("+");
        if(b%2==0) {
            System.out.print("짝수");
        }
        else {
            System.out.print("홀수");
        }
        System.out.print("=");
        if(result%2==0) {
            System.out.print("짝수");
        }
        else {
            System.out.print("홀수");
        }

   }
}
