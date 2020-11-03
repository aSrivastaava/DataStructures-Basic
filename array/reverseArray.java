package array;

import java.util.Scanner;

/**
 * reverseArray
 */

public class reverseArray {

    public static void display(int[] a) {
        for (int val : a) {
            System.out.print(val);
        }
    }

    public static void reverse(int[] a) {
        int n = a.length;
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1];
            a[n - 1] = temp;
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        reverse(a);
        display(a);
    }
}