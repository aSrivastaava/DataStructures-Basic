package Problems;

import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int i = 2;
        while (num != 1) {
            if (num % i == 0) {
                num = num / i;
                System.out.print(i + " ");
            } else {
                i++;
            }
        }

        scn.close();
    }
}
