package basic100;

import java.util.Scanner;

public class InputOutput_1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                System.out.print(i+" ");
                System.out.println(j);
            }
        }
    }
}
