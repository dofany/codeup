package if_else;

import java.util.Scanner;

public class StudentId1_1170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(a);
        System.out.print(b);
        if(c<10){
            System.out.print("0"+c);
        } else{
            System.out.print(c);
        }

    }
}
