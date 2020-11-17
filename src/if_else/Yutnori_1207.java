package if_else;

import java.util.Scanner;

public class Yutnori_1207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = a+b+c+d;
        if(e==4)
            System.out.println("윷");
        else if(e==3)
            System.out.println("걸");
        else if(e==2)
            System.out.println("개");
        else if(e==1)
            System.out.println("도");
        else
            System.out.println("모");


    }
}
