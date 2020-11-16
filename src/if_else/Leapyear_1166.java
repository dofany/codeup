package if_else;

import java.util.Scanner;

public class Leapyear_1166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
