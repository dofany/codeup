package basic100;

import java.util.Scanner;

public class InputOutput_1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long r = sc.nextLong();
        long n = sc.nextLong();
        long result = a;
        for(int i = 1; i<n; i++){
            result*=r;
        }
        System.out.println(result);
    }
}
