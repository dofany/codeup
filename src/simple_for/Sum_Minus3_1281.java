package simple_for;

import java.util.Scanner;

public class Sum_Minus3_1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        int result = 0;

        for(i = a; i<=b; i++){
            if(i%2==0){
                System.out.printf("-%d",i);
                result -= i;
            }else if(i%2==1){
                result += i;
                if(i==a){
                    System.out.printf("%d",i);
                } else{
                    System.out.printf("+%d",i);
                }
            }
        }
        System.out.printf("=%d",result);
    }
}
