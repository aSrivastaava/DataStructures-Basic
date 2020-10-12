package Problems;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = 1;
        int tp = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(tp);
            } else if (i == 1) {
                System.out.println(t);
            } else {
                int temp = tp;
                tp = t;
                t = t + temp;
                System.out.println(t);
            }
        }
        scn.close();
    }
}
