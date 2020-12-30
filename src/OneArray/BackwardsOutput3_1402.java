package OneArray;

import java.util.Scanner;

public class BackwardsOutput3_1402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = array.length-1; 0<= i; i--){
            System.out.print(array[i] + " ");
        }

    }
}
