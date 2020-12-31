package OneArray;

import java.util.Scanner;

public class Rotation_1405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[1000];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int index = 0;
        for(int j = 0; j<n; j++){
            index = j;
            for(int k = 0; k<n; k++){
                System.out.print(array[index]+ " ");
                index++;
                if(index==n){
                    index = 0;
                }
            }
            System.out.println();
        }
    }
}
