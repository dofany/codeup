package OneArray;

import java.util.Scanner;

public class SeatPlacement_1425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int t;
        int array[] = new int[100];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(array[i]>array[j]){
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        for(int i = 1; i<=n; i++){
            System.out.print(array[i-1]+" ");
            if(i%c==0)
                System.out.println();
        }
    }
}
