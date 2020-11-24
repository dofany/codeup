package simple_for;

import java.util.Scanner;

public class Sequence_1269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int result = a;

        for(int i = 2; i<=n; i++){
            result = result*b+c;
        }
        System.out.println(result);
    }
}
