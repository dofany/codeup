package if_else;

import java.util.Scanner;

public class Drainage_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = b/a;
        if(b%a==0){
            System.out.println(a+"*"+x+"="+b);
        } else if(a%b==0){
            System.out.println(b+"*"+x+"="+a);
        } else{
            System.out.println("none");
        }
    }
}
