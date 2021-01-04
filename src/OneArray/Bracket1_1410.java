package OneArray;

import java.util.Scanner;

public class Bracket1_1410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int count1 = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='(') {
                count++;
            } else if(s.charAt(i)==')'){
                count1++;
            }
        }
        System.out.print(count+" "+count1);

    }
}
