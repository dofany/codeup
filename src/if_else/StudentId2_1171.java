package if_else;

import java.util.Scanner;

public class StudentId2_1171 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(a);
        if(b<10){
            System.out.print("0"+b);
        } else{
            System.out.print(b);
        }
        if(c<100 && c>=10){
            System.out.print("0"+c);
        } else if(c<10){
            System.out.print("00"+c);
        } else{
            System.out.print(c);
        }
    }
}
