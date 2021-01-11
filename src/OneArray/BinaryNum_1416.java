package OneArray;

import java.util.Scanner;

public class BinaryNum_1416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
    }
}
