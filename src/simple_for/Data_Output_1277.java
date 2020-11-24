package simple_for;

import java.util.Scanner;

public class Data_Output_1277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int i;
        int first = 0,mid=0,last=0;
        for(i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
            if(i==0){
                first=array[i];
            }
            if(i==n/2){
                mid=array[i];
            }
            if(i==n-1){
                last=array[i];
            }

        }
        System.out.printf("%d %d %d" ,first,mid,last);

    }
}
