package nested_for;

import java.util.Scanner;

public class Pyramid2_1360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int j = i; j>=1; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
