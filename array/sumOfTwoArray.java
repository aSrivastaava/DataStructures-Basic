package array;

import java.util.Scanner;

/**
 * sumOfTwoArray
 */
public class sumOfTwoArray {

    public static int[] getArray(int n, Scanner scn) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = getArray(n1, scn);
        int n2 = scn.nextInt();
        int[] arr2 = getArray(n2, scn);
        scn.close();
        int max = n1 > n2 ? n1 : n2;
        int[] sum = new int[max];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = max - 1;
        int c = 0;

        // arr1[i]
        // arr2[j]

        while (k >= 0) {
            int add = 0;
            if (i < 0) {
                add = arr2[j] + c;
            } else if (j < 0) {
                add = arr1[i] + c;
            } else {
                add = arr1[i] + arr2[j] + c;
            }
            c = add / 10;
            sum[k] = add % 10;

            i--;
            j--;
            k--;
        }
        if (c > 0) {
            System.out.println(c);
        }
        for (int val : sum) {
            System.out.println(val);
        }
    }
}