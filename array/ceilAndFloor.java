package array;

import java.util.Scanner;

public class ceilAndFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        scn.close();

        // int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        // int d = 35;

        int l = 0;
        int h = a.length - 1;
        int c = 0;
        int f = 0;

        // With sir's logic

        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] < d) {
                l = m + 1;
                f = a[m];
            } else if (a[m] > d) {
                h = m - 1;
                c = a[m];
            } else {
                c = a[m];
                f = a[m];
                break;
            }
        }

        // With My logic

        // while (l <= h) {
        // int m = (l + h) / 2;
        // if (a[m] == d) {
        // c = a[m];
        // f = a[m];
        // break;
        // } else if (a[m] > d) {
        // c = a[m];
        // f = a[m - 1];
        // h = m - 1;
        // } else if (a[m] < d) {
        // c = a[m + 1];
        // f = a[m];
        // l = m + 1;
        // }
        // }
        System.out.println(c);
        System.out.println(f);

    }
}
