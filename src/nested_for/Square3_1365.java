package nested_for;

import java.util.Scanner;

public class Square3_1365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i==1)||(j==1)||(i==n)||(j==n)||(i==j)||(i+j==n+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

