package basic100;

import java.util.Scanner;

public class StringInfinite_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            char c = sc.next().charAt(0);
            if(c=='q') {
                System.out.println(c);
                break;
            }
            System.out.println(c);
        }
    }
}
