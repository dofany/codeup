package if_else;

import java.util.Scanner;

public class Tryangle_1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(c<a+b && b<a+c && a<b+c){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
