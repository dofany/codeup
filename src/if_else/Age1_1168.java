package if_else;

import java.util.Scanner;

public class Age1_1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (a-(a%1000))/10000;
        if(b==1 || b==2){
            System.out.println((2012-(1900+result))+1);
        }else{
            System.out.println((2012-(2000+result))+1);
        }


    }
}
