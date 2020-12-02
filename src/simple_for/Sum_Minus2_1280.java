package simple_for;

import java.util.Scanner;

public class Sum_Minus2_1280 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        int result = 0;

        for(i = a; i<=b; i++){
            if(i%2==0){
                System.out.printf("-%d",i);
                result -= i;
            }else{
                System.out.printf("+%d",i);
                result += i;
            }
        }
        System.out.printf("=%d",result);
    }
}
