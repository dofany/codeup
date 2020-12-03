package simple_for;

import java.util.Scanner;

public class AlphabatChange_1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        String output = "";
        int tmp;
        input = sc.nextLine();
        for(int i = 0; i<input.length();i++){
            tmp = (int)input.charAt(i);
            if((65<=tmp)&&(tmp<=90)){
                output += (char)(tmp+32);
            } else if((97<=tmp)&&(tmp<=122)){
                output+=(char)(tmp-32);
            }else{
                output+=(char)tmp;
            }
        }
        System.out.print(output);

    }
}
