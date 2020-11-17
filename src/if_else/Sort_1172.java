package if_else;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        for(int i = 0; i<3; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for(int i = 0; i<array.length;i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
