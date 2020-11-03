package array;

import java.util.*;

public class inverseArray {
    public static void display(int[] a) {
        for (int val : a) {
            System.out.println(val);
        }
    }

    public static int[] inverse(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            int t = a[i];
            b[t] = i;
        }

        return b;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        scn.close();

        int[] inverse = inverse(a);
        display(inverse);
    }
}
