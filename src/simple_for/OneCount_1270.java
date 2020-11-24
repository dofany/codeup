package simple_for;

import java.util.Scanner;

public class OneCount_1270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(i%10==1)
            count++;
        }
        System.out.println(count);
    }
}
