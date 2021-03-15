package TwoArray;

import java.util.Scanner;

public class TwoArray_1_6_1465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[101][101];
        int x = 1;
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = n; i>=1; i--){
            for(int j = 1; j<=m; j++){
                array[i][j] = x++;
            }
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
