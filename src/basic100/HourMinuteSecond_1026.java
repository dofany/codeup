package basic100;

import java.util.Scanner;

public class HourMinuteSecond_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] s = st.split("\\:");
        int a = Integer.parseInt(s[1]);
        System.out.printf("%d",a);
    }

}
