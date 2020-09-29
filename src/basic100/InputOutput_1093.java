package basic100;

import java.util.Scanner;

public class InputOutput_1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[24];
        int n = sc.nextInt();
        int t;
        for(int i = 1; i<=n; i++){
            t = sc.nextInt();
            array[t] = array[t]+1;
        }
        for(int i =1; i<=23; i++){
            System.out.print(array[i] + " ");
        }
    }
}
