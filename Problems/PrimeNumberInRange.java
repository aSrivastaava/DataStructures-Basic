package Problems;

import java.util.Scanner;

/**
 * PrimeNumberInRange
 */
public class PrimeNumberInRange {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int number = low; number <= high; number++) {
            int count = 0;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(number);
            }
        }
        scn.close();
    }
}