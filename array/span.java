package array;

import java.util.Scanner;

public class span {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];
        int min = 0, max = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
            if (i == 0) {
                min = a[i];
            } else if (min > a[i]) {
                min = a[i];
            }

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(max - min);

        scn.close();
    }
}
