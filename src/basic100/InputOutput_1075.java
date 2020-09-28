package basic100;

import java.util.Scanner;

public class InputOutput_1075 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = a; i>0; i--){
            a = a-1;
            System.out.println(a);
        }
    }
}
