package simple_for;

import java.util.Scanner;

public class FirstSpecialJudge_1261 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int[]b = new int[10];
        for(int i = 0; i<=9; i++){
            a = sc.nextInt();
            b[i] = a;
        }
        int flag = 0;
        for(int i = 0; i<=9; i++){
            if(b[i]%5==0){
                System.out.print(b[i]);
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.print("0");
        }
    }
}
