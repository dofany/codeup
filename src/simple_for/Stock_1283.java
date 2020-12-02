package simple_for;

import java.util.Scanner;

public class Stock_1283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = sc.nextInt();
        float c,d;
        c = a;
        for(int i = 0; i<b; i++){
            d = sc.nextFloat();
            c = c*d/100+c;
        }
        if(a>c){
            System.out.printf("%.0f\n",c-a);
            System.out.println("bad");
        } else if(a<c){
            System.out.printf("%.0f\n",c-a);
            System.out.println("good");
        } else{
            System.out.println("0");
            System.out.println("same");
        }



    }
}
