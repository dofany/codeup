package if_else;

import java.util.Scanner;

public class MaxNum_1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = a+b;
        double minus1 = a-b;
        double minus2 = b-a;
        double multi = a*b;
        double div1 = a/b;
        double div2 = b/a;
        double a2 = Math.pow(a,b);
        double b2 = Math.pow(b,a);
        double result;

        result = sum>=minus1 ? sum:minus1;
        result = result>=minus2 ? result:minus2;
        result = result>=multi ? result:multi;
        result = result>=div1 ? result:div1;
        result = result>=div2 ? result:div2;
        result = result>=a2 ? result:a2;
        result = result>=b2 ? result:b2;

        System.out.printf("%f",result);





    }
}
