package NumberSystem;

import java.util.Scanner;

public class multiplication {

    public static int addition(int base, int n1, int n2) {
        int ans = 0;

        int c = 0;
        int power = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;

            int d = d1 + d2 + c;
            c = d / base;
            int r = d % base;
            ans += r * power;
            power *= 10;
        }

        return ans;
    }

    public static int multiplyByDigit(int base, int n1, int d2) {
        int result = 0;
        int c = 0;
        int power = 1;
        while (n1 > 0 || c > 0) {

            int d1 = n1 % 10;
            n1 /= 10;

            int d = (d1 * d2) + c;
            c = d / base;

            int r = d % base;
            result += r * power;

            power *= 10;
        }

        return result;
    }

    public static int multiply(int base, int n1, int n2) {
        int finalVal = 0;

        int c = 0;
        int power = 1;
        while (n2 > 0 || c > 0) {
            int d = n2 % 10;
            n2 /= 10;
            int ans = multiplyByDigit(base, n1, d);
            finalVal = addition(base, finalVal, ans * power);
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

        System.out.println(multiply(b, n1, n2));
    }
}
