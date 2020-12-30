package basic100;
import java.util.Scanner;

public class StringOutput2_1014 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        char[] change = new char[len];
        for(int i = 0; i<len; i++){
            change[i] = s.charAt(i);
        }
        for(int i = len-1; i>=0; i--){
            System.out.print(change[i]);
        }

    }
}
