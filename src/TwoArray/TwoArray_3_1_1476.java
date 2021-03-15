package TwoArray;

import java.util.Scanner;

public class TwoArray_3_1_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[101][101];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x;
        int count = 1;

        for(x = 0; x<n+m-1; x++){
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    if(i+j == x){
                        array[j][i] = count++;
                        break;
                    }
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
