package if_else;

import java.util.Scanner;

public class Day_1214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if(b==2) {
            if(a%4==0 && a%100!=0 && b==2 || a%400==0) {
                System.out.println("29");
            }
            else{
                System.out.println("28");
            }
        }
        else{
            if(b==4 || b==6 || b==9 || b==11){
                System.out.println("30");
            }else{
                System.out.println("31");
            }
        }

    }
}
