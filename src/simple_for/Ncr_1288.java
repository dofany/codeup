package simple_for;

import java.util.Scanner;

public class Ncr_1288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = fact(n)/(fact(r)*fact(n-r));
        System.out.print(result);
    }
    public static int fact(int n){
        int sum = 1;
        for(int i = 1; i<=n; i++){
            sum*=i;
        }
        return sum;
    }

}
