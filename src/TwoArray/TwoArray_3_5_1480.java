package TwoArray;

import java.util.Scanner;

public class TwoArray_3_5_1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[101][101];
        int count = 1;

        for (int i = n+m; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (j+k == i) {
                        a[j][k] = count++;
                    }
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}