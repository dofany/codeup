package string;

import java.util.Scanner;

public class Password_1408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str.append(sc.nextLine());

        for(int i = 0; i<str.length(); i++){
            System.out.print((char)(str.charAt(i)+2));
        }
        System.out.println();
        for(int i = 0; i<str.length();i++){
            System.out.print((char)((str.charAt(i)*7)%80+48));
        }
    }
}
