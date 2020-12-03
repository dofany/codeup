package simple_for;

import java.util.Scanner;

public class MultiplicationTable_1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        for(int i = 1; i<=9; i++){
            a = n*i;
            for(int j = 0; j<a; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
