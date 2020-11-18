package if_else;

import java.util.Scanner;

public class Lotto_1226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lotto[] = new int[7];
        int n;
        int correct = 0;
        int bonus = 0;
        String s = "";

        for (int i = 0; i < 7; i++) {
            lotto[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            n = sc.nextInt();
            for (int j = 0; j < 7; j++) {
                if (lotto[j] == n) {
                    if (j == 6)
                        bonus++;
                    else
                        correct++;
                }
            }
        }


        if (correct <= 2) s = "0";
        else if (correct == 3) s = "5";
        else if (correct == 4) s = "4";
        else if (correct == 5 && bonus == 0) s = "3";
        else if (correct == 5 && bonus == 1) s = "2";
        else if (correct == 6) s = "1";
        System.out.printf("" + s);

    }
}
