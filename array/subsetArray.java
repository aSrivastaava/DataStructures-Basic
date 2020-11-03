package array;

import java.util.Scanner;

public class subsetArray {

    public static void subset(int[] a) {
        int limit = (int) Math.pow(2, a.length);
        for (int i = 0; i < limit; i++) {
            String subarray = "";
            int t = i;
            for (int j = a.length - 1; j >= 0; j--) {
                int r = t % 2;
                t /= 2;

                if (r == 0) {
                    subarray = "-\t" + subarray;
                } else {
                    subarray = a[j] + "\t" + subarray;
                }
            }

            System.out.println(subarray);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        scn.close();

        subset(a);
    }
}
