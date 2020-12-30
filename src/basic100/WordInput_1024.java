package basic100;

import java.util.Scanner;

public class WordInput_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");
        for(int i = 0; i<array.length;i++){
            System.out.println("'"+array[i]+"'");
        }
    }
}
