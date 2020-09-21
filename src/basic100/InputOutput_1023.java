package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class InputOutput_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s,".");
        String[] num = new String[2];
        int i = 0;
        while(st.hasMoreTokens()){
            num[i] = st.nextToken();
            i+=1;
        }
        System.out.println(num[0]+"\n"+num[1]);
    }
}
