package simple_for;

import java.util.Scanner;

public class N_Sum_1266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int sum = 0;
        for(int i = 0; i< array.length; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }

        System.out.println(sum);
    }
}
