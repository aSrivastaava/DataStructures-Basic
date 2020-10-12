package Problems;

import java.util.Scanner;

public class positionInverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int totalDigit = 0;
        int inverseN = 0;
        int lastDigit = 0;

        while (n != 0) {
            // calculate the last digit of the number
            lastDigit = n % 10;

            // removing the last digit of the number
            n /= 10;

            // increasing the count of the totalDigit to get the total number of digits in
            // the given number.
            totalDigit++;

            // adding last digit to the inverse number itself.
            inverseN = (int) (inverseN + (totalDigit * (Math.pow(10, lastDigit - 1))));
        }

        System.out.println(inverseN);

        scn.close();
    }
}
