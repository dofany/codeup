package simple_for;

import java.util.Scanner;

public class PrimeNum_1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        for(i = 2; i<=n; i++){
            if(n%i==0){
                break;
            }
        }
        if(n==i){
            System.out.print("prime");
        } else if(n!=i){
            System.out.print("not prime");
        }
    }
}
