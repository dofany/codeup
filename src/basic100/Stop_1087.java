package basic100;

import java.util.Scanner;

public class Stop_1087 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n,i,s = 0;
        n = sc.nextInt();
        for(i=1;;i++){
            s+=i;
            if(s>=n)
                break;
        }
        System.out.println(s);
    }
}
