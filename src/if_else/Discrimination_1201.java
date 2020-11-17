package if_else;

import java.util.Scanner;

public class Discrimination_1201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("양수");
        } else if(a==0){
            System.out.println("0");
        }
        else{
            System.out.println("음수");
        }
    }
}
