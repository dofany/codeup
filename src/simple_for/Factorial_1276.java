package simple_for;

import java.util.Scanner;

public class Factorial_1276 {

    public static int fact(int n){
        if(n<=1)
            return n;
        else
            return fact(n-1)*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fact(input));
    }
}
