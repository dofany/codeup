package basic100;

import java.util.Scanner;

public class InputOutput_1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[20][20];
        int n = sc.nextInt();
        int x, y;
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            array[x][y] = 1;
        }
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
