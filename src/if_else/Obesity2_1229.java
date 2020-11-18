package if_else;

import java.util.Scanner;

public class Obesity2_1229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result1=0;
        double result2=0;

        if(a<150){
            result1 = (a-100);
        } else if(a<160){
            result1 = (a-150)/2 + 50;
        } else{
            result1 = (a-100)*0.9;
        }

        result2 = (b-result1)*100/result1;
        if(result2<=10){
            System.out.println("정상");
        } else if(result2<=20){
            System.out.println("과체중");
        } else{
            System.out.println("비만");
        }

    }
}
