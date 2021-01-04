package OneArray;

import java.util.Arrays;
import java.util.Scanner;

public class Card_1411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[50];
        for(int i = 0; i<n-1; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array,0,n-1);
        for(int i = 0; i<n; i++){
            if(array[i] != i+1 || array[i]==0){
                System.out.println(i+1);
                break;
            }
        }
    }
}
