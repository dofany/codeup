package TwoArray;

import java.util.Scanner;

public class TwoArray_1_1_1460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][n];
        int x = 1;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                array[i][j] = x;
                x++;
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
