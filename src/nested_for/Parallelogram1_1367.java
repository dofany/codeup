package nested_for;

import java.util.Scanner;

public class Parallelogram1_1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if((i+j>n)&&(i+j<n*2+1)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
