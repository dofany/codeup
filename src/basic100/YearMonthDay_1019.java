package basic100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class YearMonthDay_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        StringTokenizer st = new StringTokenizer(date,".");
        int[] array = new int[3];
        int i = 0;
        while(st.hasMoreTokens()){
            array[i] = Integer.parseInt(st.nextToken());
            i+=1;
        }
        String year = String.format("%04d",array[0]);
        String month = String.format("%02d",array[1]);
        String day = String.format("%02d",array[2]);
        System.out.println(year+"."+month+"."+day);
    }
}
