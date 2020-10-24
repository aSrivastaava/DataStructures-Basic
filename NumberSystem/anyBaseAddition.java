package NumberSystem;

import java.util.Scanner;

public class anyBaseAddition {

    public static int baseAddition(int base, int num1, int num2) {
        int finalVal = 0;
        int power = 1;
        int q = 0;
        while (num1 > 0 || num2 > 0 || q > 0) {
            int r1 = num1 % 10;
            int r2 = num2 % 10;

            num1 /= 10;
            num2 /= 10;

            int sum = r1 + r2 + q;
            q = sum / base;

            sum %= base;

            finalVal += sum * power;
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

        System.out.println(baseAddition(b, n1, n2));
    }
}
