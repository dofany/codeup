package TwoArray;

import java.util.Scanner;

public class TwoArray_3_2_1477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[][] = new int[101][101];
        int x = 1;
        int count = 1;
        for (x = 0; x < n + m - 1; x++) {
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    if(i+j==x){
                        array[i][j] = count++;
                        break;
                    }
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
