package TwoArray;

import java.util.Scanner;

public class TwoArray_2_3_1470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[101][101];
        int x = 1;

        for(int i = 1; i<=n; i++){
            if(i%2 != 0) {
                for (int j = 1; j <= n; j++) {
                    array[j][i] = x++;
                }
            }
            else{
                for(int j = n; j>=1; j--){
                    array[j][i] = x++;
                }
            }
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
