package nested_for;

import java.util.Scanner;

public class Pyramid3_1362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        for(int i = 1; i<=n; i++){
            m += i;
        }
        int x = 1;
        int y = 0;
        for(int i = m; i>0; i--){
            if(x==y){
                y = 0;
                x++;
                System.out.println();
            }
            y++;
            System.out.print(i+" ");
        }
    }
}
