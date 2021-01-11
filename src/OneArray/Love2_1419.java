package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Love2_1419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char array[] = s.toCharArray();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'l' && array[i+1] == 'o' && array[i+2] == 'v' && array[i+3] == 'e')
                count++;
        }
        System.out.println(count);
    }
}
