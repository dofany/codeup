package if_else;

import java.util.Scanner;

public class Tunnel1_1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=170 || b<=170 || c<=170){
            System.out.println("CRASH");
        } else{
            System.out.println("PASS");
        }


    }
}
