package OneArray;

import java.util.Scanner;

public class Alphabat_1412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = new char[90];
        int count[] = new int[26];
        for(int i = 0; i<c.length; i++){
            c[i] = (char)(i+97);
        }
        for(int i = 0; i<c.length;i++){
            for(int j =0; j<s.length();j++){
                if(c[i]==s.charAt(j)){
                    count[i]++;
                }
            }
        }
        for(int i = 0; i<count.length; i++){
            System.out.println(c[i]+":"+count[i]);
        }
    }
}
