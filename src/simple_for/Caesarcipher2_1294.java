package simple_for;

import java.util.Scanner;

public class Caesarcipher2_1294 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                if (s.charAt(i) + 3 > 90) {
                    answer += (char) (s.charAt(i) + 3 - 26);
                } else {
                    answer += (char) (s.charAt(i) + 3);
                }
            }
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                if (s.charAt(i) + 3 > 122) {
                    answer += (char) (s.charAt(i) + 3 - 26);
                } else {
                    answer += (char) (s.charAt(i) + 3);
                }
            }
            if (s.charAt(i) == 32) {
                answer += " ";
            }
        }
        return answer;
    }
}
