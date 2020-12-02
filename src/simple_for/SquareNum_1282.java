package simple_for;

import java.util.Scanner;

public class SquareNum_1282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int t = 0;

        for(int i = 1; i<=n; i++){
            if((n>=i*i) && (n<(i+1)*(i+1))){
                k = n-i*i;
                t = i;
                break;
            }
        }
        System.out.print(k+" "+t);

    }
}
