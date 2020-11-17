package if_else;

import java.util.Scanner;

public class TrashCan_1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a%10*10)+(a/10);
        b = b*2;
        b = b%100;
        System.out.println(b);
        if(b<=50)
            System.out.println("GOOD");
        else
            System.out.println("OH MY GOD");
    }
}
