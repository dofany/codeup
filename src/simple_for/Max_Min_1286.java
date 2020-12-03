package simple_for;

import java.util.Scanner;

public class Max_Min_1286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -10000000;
        int min = 10000000;
        for(int i = 1; i<=5; i++){
            int a = sc.nextInt();
            if(max<a){
                max = a;
            }
            if(min>a){
                min = a;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
