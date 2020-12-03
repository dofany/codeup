package simple_for;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator2_1285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        String[] st = s.split("");
        int b = 0;
        for (int i = 0; i < st.length; i++) {
            try {
                b = Integer.parseInt(st[i]);
            } catch (Exception e) {
                arr.add(i);
            }
        }
        arr.add(0, -1);
        arr.add(0);
        String[] st1 = new String[arr.size() - 2];
        for (int i = 0; i < st1.length; i++) {
            st1[i] = "";
        }
        int[] num = new int[arr.size() - 2];
        for (int j = 1; j < arr.size(); j++) {
            for (int i = arr.get(j - 1) + 1; i < arr.get(j); i++) {
                st1[j - 1] += st[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st1[i]);
        }
        arr.remove(0);
        arr.remove(arr.size() - 1);
        for (int i = 0; i < arr.size() - 1; i++) {
            switch (st[arr.get(i)]) {
                case "+":
                    num[i + 1] = num[i] + num[i + 1];
                    break;
                case "-":
                    num[i + 1] = num[i] - num[i + 1];
                    break;
                case "*":
                    num[i + 1] = num[i] * num[i + 1];
                    break;
                case "/":
                    num[i + 1] = num[i] / num[i + 1];
                default:
                    break;

            }
        }
        System.out.println(num[num.length - 1]);
    }
}