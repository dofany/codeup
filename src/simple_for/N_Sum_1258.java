package simple_for;

import java.util.Scanner;

public class N_Sum_1258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
