package TwoArray;

import java.util.Scanner;

public class TwoArray_2_5_1472 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[][] = new int[101][101];
        int x = 1;
        int number = 1;

        for (int i = n; i >=1; i--) {
            if (number % 2 == 0) {
                for (int j = 1; j <= m; j++) {
                    array[i][j] = x++;
                }
            } else {
                for (int j = m; j >= 1; j--) {
                    array[i][j] = x++;
                }
            }
            number++;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
