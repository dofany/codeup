package TwoArray;

import java.util.Scanner;

public class TwoArray_1_4_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[101][101];
        int n = sc.nextInt();
        int x = 1;

        for(int i = 1; i<=n; i++){
            for(int j = n; j>=1; j--){
                array[j][i] = x++;
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
