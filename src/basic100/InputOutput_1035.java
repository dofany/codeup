package basic100;

import java.util.Scanner;

public class InputOutput_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = Integer.valueOf(s, 16);
        System.out.printf("%o",a);
    }
}
