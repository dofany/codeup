package basic100;

import java.util.Scanner;

public class InputOutput_1025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] num = s.toCharArray();
        for(int i = 0; i<num.length; i++){
            System.out.print("["+num[i]);
            for(int j = num.length-1; j>i; j--){
                System.out.print("0");
            }
            System.out.println("]");
        }

    }

}