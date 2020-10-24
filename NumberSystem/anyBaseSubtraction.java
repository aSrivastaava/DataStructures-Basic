package NumberSystem;

import java.util.Scanner;

/**
 * anyBaseSubtraction
 */
public class anyBaseSubtraction {

    public static int subtraction(int base, int n1, int n2) {
        int finalVal = 0;

        int c = 0;
        int power = 1;

        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            d2 -= c;
            if (d2 < d1) {
                d2 += base;
                c = 1;
            } else {
                c = 0;
            }

            int r = d2 - d1;
            finalVal += r * power;
            power *= 10;
        }
        return finalVal;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();

        System.out.println(subtraction(b, n1, n2));
    }
}