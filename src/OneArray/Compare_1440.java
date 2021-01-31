package OneArray;

import java.util.Scanner;

public class Compare_1440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[1000];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++){
            System.out.printf("%d: ",j+1);
            for(int k = 0; k<n; k++){
                if(j!=k){
                    if(array[j] > array[k]) {
                        System.out.print("> ");
                    } else if(array[j]<array[k]){
                        System.out.print("< ");
                    } else{
                        System.out.print("= ");
                    }
                }
            }
            System.out.println();
        }
    }
}
