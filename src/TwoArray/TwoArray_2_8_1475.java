package TwoArray;

import java.util.Scanner;

public class TwoArray_2_8_1475 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[][] = new int[101][101];
        int x = 1;
        int number = 1;

        for (int i = m; i >= 1; i--) {
            if (x % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    array[i][j] = number++;
                }
            } else {
                for (int j = n; j >= 1; j--) {
                    array[i][j] = number++;
                }
            }
            x++;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}

