package OneArray;

import java.util.Scanner;

public class Parrot_1413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}