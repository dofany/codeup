package simple_for;

import java.util.Scanner;

public class MaxNum_1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int array[] = new int[n];
        int max = 0;
        for(int i = 0; i< array.length; i++){
            array[i] = sc.nextInt();
            if(max<array[i])
            {
                max = array[i];

            }
        }
        System.out.println(max);
    }
}
