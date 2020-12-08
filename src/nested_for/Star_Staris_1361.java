package nested_for;

import java.util.Scanner;

public class Star_Staris_1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            System.out.print("**");
            space++;
            System.out.println();
        }
    }
}
