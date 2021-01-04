package OneArray;

import java.util.Scanner;

public class Memory1_1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i<10; i++){
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        System.out.print(array[n-1]);

    }
}
