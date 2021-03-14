package string;

import java.util.Scanner;

public class Discrimination_1990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int sum = 0;
        char num[] = new char[n.length()];

        for(int i = 0; i<num.length; i++){
            num[i] = n.charAt(i);
            sum += num[i];
        }

        if(sum % 3 == 0){
            System.out.print("1");
        } else{
            System.out.print("0");
        }
    }
}
