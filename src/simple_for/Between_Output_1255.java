package simple_for;

import java.util.Scanner;

public class Between_Output_1255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        for(double i = a; i<=b; i += 0.01 ){
            System.out.printf("%.2f " , i);
        }
    }
}
