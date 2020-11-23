package simple_for;

import java.util.Scanner;

public class Alphabat_1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        while(a<=b){
            System.out.print(a + " ");
            a++;
        }
    }
}
