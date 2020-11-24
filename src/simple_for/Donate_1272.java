package simple_for;

import java.util.Scanner;

public class Donate_1272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;

        if(a>=b){
            temp = a;
        } else{
            temp = b;
        }
        
        int money,a_money = 0,b_money = 0;
        
        for(int i = 1; i<=temp; i++){
            if(i%2==1){
                money = (i+2)/2;
            } else{
                money = (i/2)*10;
            }
            if(i==a){
                a_money = money;
            } if(i==b){
                b_money = money;
            }
        }
        System.out.print(a_money+b_money);

    }
}
