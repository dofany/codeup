package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SocialSecurityNum_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        StringTokenizer st = new StringTokenizer(num, "-");
        String result = "";
        while(st.hasMoreTokens()){
            result+=st.nextToken();
        }
        System.out.println(result);
    }
}
