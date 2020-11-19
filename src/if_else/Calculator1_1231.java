package if_else;

import java.util.ArrayList;
import java.util.Scanner;


public class Calculator1_1231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String input = scan.nextLine();
        String[] part = input.split("");
        int a = 0;
        for(int i = 0 ; i < part.length ; i++){
            try {
                arr.add(Integer.parseInt(part[i]));
            }
            catch(Exception e) {
                a = i;
            }
        }
        String a1 = "";
        String a2 = "";
        for(int i = 0 ; i < a ; i++ ){
            a1 += part[i];
        }
        for(int i = a+1 ; i < part.length ; i++ ){
            a2 += part[i];
        }
        int input1 = Integer.parseInt(a1);
        int input2 = Integer.parseInt(a2);

        switch(part[a]){
            case "+":
                System.out.println(input1 + input2);
                break;
            case "-":
                System.out.println(input1 - input2);
                break;
            case "*" :
                System.out.println(input1 * input2);
                break;
            default :
                System.out.printf("%.2f",(double)input1 / (double)input2);
        }
    }
}
