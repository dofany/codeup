package OneArray;

import java.util.Scanner;

public class AttendanceNum1_1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[24];
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int t = sc.nextInt();
            array[t] += 1;
        }
        for(int j = 1; j<24; j++){
            System.out.print(array[j] + " ");
        }
    }
}
