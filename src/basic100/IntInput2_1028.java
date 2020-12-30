package basic100;

import java.util.Scanner;

public class IntInput2_1028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseUnsignedInt(sc.nextLine());
        String s = Integer.toUnsignedString(a);
        System.out.println(s);
    }
}
