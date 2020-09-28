package basic100;

import java.util.Scanner;

public class InputOutput_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i,n;
        n = sc.nextInt();
        for(i =1; i<=n; i++){
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
