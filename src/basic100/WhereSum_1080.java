package basic100;

import java.util.Scanner;

public class WhereSum_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x = sc.nextInt();
        for(int i = 1; i<=x; i++){
            sum = sum+i;
            if(sum>=x){
                System.out.println(i);
                break;
            }
        }
    }
}
