package nested_for;

import java.util.Scanner;

public class Square2_1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if((j==1||j==n)||(i==1||i==n)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
