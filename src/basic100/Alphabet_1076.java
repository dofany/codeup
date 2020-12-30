package basic100;

import java.util.Scanner;

public class Alphabet_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        for(char x = 'a'; x<=c; x++){
            System.out.print(x);
            if(x!=c)
                System.out.print(" ");
        }
    }
}
