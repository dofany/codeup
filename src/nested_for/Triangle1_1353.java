package nested_for;

import java.util.Scanner;

public class Triangle1_1353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
