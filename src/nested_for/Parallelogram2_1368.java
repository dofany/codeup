package nested_for;

import java.util.Scanner;

public class Parallelogram2_1368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        for(int i = 0 ; i<a; i++){
            if(c=='L')
                for(int j = 0; j<i; j++)
                    System.out.print(" ");
                else
                    for(int j = a-i-1; j>0; j--)
                        System.out.print(" ");
                    for(int j = 0; j<b; j++){
                        System.out.print("*");
                    }
                    if(!(i==a-1))
                        System.out.println();

        }
    }
}
