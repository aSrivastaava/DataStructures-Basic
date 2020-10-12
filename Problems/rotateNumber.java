// In this two numbers n and k will be given, where n will be any number in range 1 <= n < 10^9
// and k is the rotating constant having range -digit(n) < k < digit(n)
// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12349856
//    k = 3
//    r = 85612349

package Problems;

import java.util.Scanner;

public class rotateNumber {
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

        if (k > 0) {
            // remove the rightmost digit according to k from n.
            rotated_n = (int) ((n % Math.pow(10, k)) * Math.pow(10, (t_digit - k)));
            n /= Math.pow(10, k);
            rotated_n += n;
        } else {
            // romove the leftmost digit according to k from n.
            rotated_n = (int) ((n % Math.pow(10, (t_digit + k))) * Math.pow(10, -k));
            n /= Math.pow(10, (t_digit + k));
            rotated_n += n;
        }

        System.out.println(rotated_n);
    }
}
