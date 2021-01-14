package OneArray;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdSearch_1420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String name[] = new String[n];
        int[] num = new int[n];
        for(int i = 0; i<n; i++){
            String a = sc.nextLine();
            String[] pp = a.split(" ");
            name[i] = pp[0];
            num[i] = Integer.parseInt(pp[1]);
        }

        int bignum = 0;
        int first = 0;
        int second = 0;
        int thirth = 0;

        for(int i =0; i<3; i++){
            for(int j=0; j<num.length; j++){

                if(i==0&&bignum<num[j]&&second==0&&thirth==0){
                    bignum= num[j];
                    first= j;
                }

                else if(bignum<num[j]&&i==1 && first!=j&&thirth ==0  ){
                    bignum= num[j];
                    second = j;
                }

                else if(bignum<num[j]&&i==2 && second!=j && first!=j ){
                    bignum= num[j];
                    thirth = j;
                }

            }

            bignum=0;
        }


        System.out.println(name[thirth]);

    }
}
