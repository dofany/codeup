package basic100;

import java.util.Scanner;

public class InputOutput_1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = Integer.parseInt(s,16);
        for(int i = 1; i<16; i++){
            System.out.printf("%X*%X=%X\n",num,i,num*i);
        }

    }
}
