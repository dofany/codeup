package basic100;

import java.util.Scanner;

public class AsciiCode_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(0<=a && a <128){
            char c = (char)a;
            System.out.println(c);
        }
    }
}
