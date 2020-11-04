package array;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int s = scn.nextInt();
        scn.close();

        // int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        // int s = 80;

        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (s > a[m]) {
                l = m + 1;
            } else if (s < a[m]) {
                h = m - 1;
            } else {
                System.out.println(m);
                return;
            }
        }
        System.out.println(-1);
    }
}