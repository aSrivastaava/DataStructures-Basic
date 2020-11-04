package array;

import java.util.Scanner;

public class firstAndLastIndex {
    public static int lastIndexSearch(int[] a, int d) {
        int lastIndex = -1;

        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (d > a[mid]) {
                l = mid + 1;
            } else if (d < a[mid]) {
                h = mid - 1;
            } else {
                lastIndex = mid;
                l = mid + 1;
            }
        }

        return lastIndex;
    }

    public static int firstIndexSearch(int[] a, int d) {
        int firstIndex = -1;

        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (d > a[mid]) {
                l = mid + 1;
            } else if (d < a[mid]) {
                h = mid - 1;
            } else {
                firstIndex = mid;
                h = mid - 1;
            }
        }
        return firstIndex;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        scn.close();

        int firstIndex = firstIndexSearch(a, d);
        int lastIndex = lastIndexSearch(a, d);

        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }
}
