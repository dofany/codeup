package basic100;

import java.util.Scanner;

public class SugarSnack_1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int count = sc.nextInt();

        int[][] array = new int[w][h];
        for (int i = 0; i < count; i++) {

            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;


            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    if (y - 1 + j < 100 - h) {
                        array[x][y + j] = 1;
                    }
                } else {
                    if (x - 1 + j < 100 - w) {
                        array[x + j][y] = 1;
                    }
                }
            }

        }

        for (int a = 0; a < w; a++) {
            for (int b = 0; b < h; b++) {
                System.out.printf("%d ", array[a][b]);
            }
            System.out.println();
        }

    }

}