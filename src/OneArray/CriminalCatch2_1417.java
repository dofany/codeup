package OneArray;

import java.util.Arrays;
import java.util.Scanner;

public class CriminalCatch2_1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        for(int i = 0; i<10; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[7]);

    }
}
