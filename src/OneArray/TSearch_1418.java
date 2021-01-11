package OneArray;

import java.util.Scanner;

public class TSearch_1418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if(c[i] == 't'){
                System.out.print(i+1 + " ");
            }
        }
    }
}
