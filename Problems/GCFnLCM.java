package Problems;

import java.util.Scanner;

public class GCFnLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int did = num1, div = num2;

        while (did % div != 0) {
            int r = did % div;
            did = div;
            div = r;
        }

        int gcd = div;
        int lcm = (num1 * num2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

        scn.close();
    }
}
