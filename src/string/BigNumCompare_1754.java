package string;

import java.util.Scanner;

public class BigNumCompare_1754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char[] str1 = new char[s1.length()];
        char[] str2 = new char[s2.length()];
        int i;
        for(i = 0; i<str1.length; i++){
            str1[i] = s1.charAt(i);
        }
        for(i = 0; i<str2.length; i++){
            str2[i] = s2.charAt(i);
        }
        if (str1.length > str2.length)
        {
            System.out.printf("%s %s", s2, s1);
        }
        else if (str1.length < str2.length)
        {
            System.out.printf("%s %s", s1, s2);
        }
        else
        {
            for(i = 0; i < str2.length; i++){
                if (str1[i] > str2[i])
                {
                    System.out.printf("%s %s", s2, s1);
                    break;
                }
                else if (str1[i] < str2[i])
                {
                    System.out.printf("%s %s", s1, s2);
                    break;
                }
                else ;
            }
        }


    }
}
