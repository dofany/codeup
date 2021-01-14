package nested_for;

import java.util.Scanner;

public class Sequence_1378 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                sum += j;
            }
        }

        System.out.print(sum);

    }
}
