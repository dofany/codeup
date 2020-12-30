package basic100;

import java.util.Scanner;

public class NumberListed1_1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int count = a;

        for(int i = 1; i<n; i++){
            count+=d;
        }
        System.out.println(count);
    }
}
