package simple_for;

import java.util.Scanner;

public class Playground_1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int x = 0, y = 0, z = 0;
        x = a*b;
        y = c*d;
        z = e*f;

        if(x>y && x>z){
            System.out.println(x);
        } else if(y>x && y>z){
            System.out.println(y);
        } else{
            System.out.println(z);
        }

    }
}
