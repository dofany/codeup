package basic100;

import java.util.Scanner;

public class InputOutput_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        for(int i = array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
