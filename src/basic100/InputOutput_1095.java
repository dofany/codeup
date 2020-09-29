package basic100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InputOutput_1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(Collections.min(list));
    }
}
