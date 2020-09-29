package basic100;

import java.util.Scanner;

public class InputOutput_1097 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        int count = scan.nextInt();
        for (int j = 0; j < count; j++) {

            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;

            for (int n1 = y - 1; n1 >= 0; n1--) {
                if (array[x][n1] == 1) {
                    array[x][n1] = 0;
                } else {
                    array[x][n1] = 1;
                }
            }
            for (int n2 = y + 1; n2 < 19; n2++) {
                if (array[x][n2] == 1) {
                    array[x][n2] = 0;
                } else {
                    array[x][n2] = 1;
                }
            }
            for (int n3 = x - 1; n3 >= 0; n3--) {
                if (array[n3][y] == 1) {
                    array[n3][y] = 0;
                } else {
                    array[n3][y] = 1;
                }
            }

            for (int n4 = x + 1; n4 < 19; n4++) {
                if (array[n4][y] == 1) {
                    array[n4][y] = 0;
                } else {
                    array[n4][y] = 1;
                }
            }

        }

        for (int n = 0; n < 19; n++) {
            for (int m = 0; m < 19; m++) {
                System.out.printf("%d ", array[n][m]);
            }
            System.out.println();
        }

    }

}
