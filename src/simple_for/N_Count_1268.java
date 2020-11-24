package simple_for;

import java.util.Scanner;

public class N_Count_1268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int count = 0;

        for(int i = 0; i< array.length; i++){
            array[i] = sc.nextInt();
            if(array[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
