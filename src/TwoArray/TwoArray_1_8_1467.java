package TwoArray;

import java.util.Scanner;

public class TwoArray_1_8_1467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[101][101];
        int x = 1;
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = m; i>=1; i--){
            for(int j = 1; j<=n; j++){
                array[i][j] = x++;


            }
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
