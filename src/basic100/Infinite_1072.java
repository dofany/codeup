package basic100;

import java.util.Scanner;

public class Infinite_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x[] = new int[a];
        for(int i = 0; i<a; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i<a; i++){
            System.out.println(x[i]);
        }
    }
}
