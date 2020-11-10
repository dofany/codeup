package basic100;

import java.util.Scanner;

public class Ant_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] location = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                location[i][j] = sc.nextInt();
            }
        }
        int x = 1;
        int y = 1;
        while (x < 10 && y < 10) {
            if (location[1][1] == 2) {
                location[1][1] = 9;
                break;
            } else {
                location[1][1] = 9;
            }

            if (x < 10 && y + 1 < 10 && location[x][y + 1] == 0) {
                location[x][y + 1] = 9;
                y++;
            } else if (x < 10 && y + 1 < 10 && location[x][y + 1] == 2) {
                location[x][y + 1] = 9;
                break;
            } else if (x + 1 < 10 && y < 10 && location[x + 1][y] == 0) {
                location[x + 1][y] = 9;
                x++;
            } else if (x + 1 < 10 && y < 10 && location[x + 1][y] == 2) {
                location[x + 1][y] = 9;
                break;
            } else {
                break;
            }

        }

        for (int n = 0; n < 10; n++) {
            for (int m = 0; m < 10; m++) {
                System.out.printf("%d ", location[n][m]);
            }
            System.out.println();
        }

    }
}
