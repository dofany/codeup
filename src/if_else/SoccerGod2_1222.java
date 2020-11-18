package if_else;

import java.util.Scanner;

public class SoccerGod2_1222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = ((89 - a) / 5) + 1;

        if (result + b > c) {
            System.out.println("win");
        } else if (result + b == c){
            System.out.println("same");
        } else{
            System.out.println("lose");
        }

    }
}
