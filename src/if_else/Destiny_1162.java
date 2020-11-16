package if_else;

import java.util.Scanner;

public class Destiny_1162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a-b+c)%10;

        if(result==0){
            System.out.println("대박");
        }else{
            System.out.println("그럭저럭");
        }



    }
}
