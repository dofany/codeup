package TwoArray;

import java.util.Scanner;

public class TwoArray_1_5_1464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 1;
        int array[][] = new int[101][101];

        for(int i = n; i>=1; i--){
            for(int j = m; j>=1; j--){
                array[i][j] = x++;
            }
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }



    }
}
