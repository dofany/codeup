package OneArray;

import java.util.HashMap;
import java.util.Scanner;

public class Memory2_1430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            hm.put(sc.nextInt(),1);
        }
        int m = sc.nextInt();
        for(int i = 0; i<m; i++){
            int tmp = sc.nextInt();
            if(hm.containsKey(tmp))
                System.out.print(hm.get(tmp));
            else
                System.out.print("0");
            System.out.print(" ");
        }
    }
}
