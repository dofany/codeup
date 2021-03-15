package TwoArray;

import java.util.Scanner;

public class TwoArray_2_1_1468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[101][101];
        int x = 1;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i%2 != 0){

            for (int j = 1; j <=n; j++) {
                array[i][j] = x++;
            }

            }
            else{
                for(int j = n; j>=1; j--){
                    array[i][j]=x++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
