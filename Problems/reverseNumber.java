package Problems;

import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit = 0;
        int temp = n;

        while (n != 0) {
            n /= 10;
            digit = temp - (n * 10);
            temp = n;
            System.out.println(digit);
        }

        scn.close();
    }
}
