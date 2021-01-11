package OneArray;

import java.util.Scanner;

public class MaxNum_1415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[11];
        int max = 0;
        int max1 = 0;

        for (int i = 0; i <10; i++) {
            array[i] = sc.nextInt();
            if (array[i] >= max && array[i] % 2 != 0) {
                max = array[i];
            }
            if (array[i] >= max1 && array[i] % 2 == 0) {
                max1 = array[i];
            }

        }
        if(max!=0)
            System.out.print(max + " ");

        if(max1!=0)
            System.out.print(max1);

    }
}
