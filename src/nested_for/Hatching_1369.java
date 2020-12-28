package nested_for;

import java.util.Scanner;

public class Hatching_1369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i==1)||(j==1)||(i==n)||(j==n)){
                    System.out.print("*");
                }else if(k==1){
                    System.out.print("*");
                } else if((i+j)%k==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
