package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Csearch_1414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char array[] = s.toCharArray();

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'c' || array[i] == 'C')
                count++;
        }
        for (int i = 0; i < array.length - 1; i++) {


            if ((array[i] == 'c' || array[i] == 'C') && (array[i + 1] == 'c' || array[i + 1] == 'C'))
                count1++;


        }
        System.out.println(count);
        System.out.println(count1);
    }
}
