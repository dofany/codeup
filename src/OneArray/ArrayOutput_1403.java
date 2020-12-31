package OneArray;

import java.util.Scanner;

public class ArrayOutput_1403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int array[] = new int[k];
        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
            System.out.println(array[i] + " ");

        }
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
}
