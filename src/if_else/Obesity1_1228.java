package if_else;

import java.util.Scanner;

public class Obesity1_1228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result1 = (a-100)*0.9;
        double result2 = (b-result1) * 100 / result1;

        if(result2<=10){
            System.out.println("정상");
        } else if(result2>10 && result2<=20){
            System.out.println("과체중");
        } else{
            System.out.println("비만");
        }
    }
}
