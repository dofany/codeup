package if_else;

import java.util.Scanner;

public class Age2_1169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = (2012-(a-1))%100;
        if(a>=14 && a <=113){
            System.out.print(result + " 1");
        } else{
            System.out.println(result + " 3");
        }
    }
}
