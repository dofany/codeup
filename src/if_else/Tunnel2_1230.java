package if_else;

import java.util.Scanner;

public class Tunnel2_1230 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=170){
            System.out.println("CRASH " + a);
        } else if(b<=170){
            System.out.println("CRASH " + b);
        } else if(c<=170){
            System.out.println("CRASH " + c);
        } else{
            System.out.println("PASS");
        }
    }
}
