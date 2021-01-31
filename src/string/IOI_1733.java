package string;

import java.util.Scanner;

public class IOI_1733 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] array = new char[1000];

        for(int i = 0; i<s.length(); i++){
            array[i] = s.charAt(i);
        }
        if (array[0] == 'I' && array[1] == 'O' && array[2] == 'I' && array[3] =='\0') {
            System.out.print("IOI is the International Olympiad in Informatics.");
        } else {
            System.out.print("I don't care.");
        }

    }
}