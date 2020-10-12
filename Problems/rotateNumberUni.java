// In this two numbers n and k will be given, where n will be any number in range 1 <= n < 10^9
// and k is the rotating constant having range -10^9 < k < 10^9
// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12349856
//    k = 3
//    r = 85612349
package Problems;

import java.util.Scanner;

public record rotateNumberUni() {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double k = scn.nextInt();
        scn.close();

        int temp = n;
        int t_digit = 0;
        int rotated_n = 0;

        // calculate the total digit in the number n.
        while (temp != 0) {
            temp /= 10;
            t_digit++;
        }

        k = k % t_digit;
        if (k < 0) {
            k = k + t_digit;
        }

        int div = 1;
        int mult = 1;

        for (int i = 1; i <= t_digit; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mult *= 10;
            }
        }

        int q = n / div;
        rotated_n = n % div;

        rotated_n = (rotated_n * mult) + q;
        System.out.println(rotated_n);

    }
}
