package array;

import java.util.Scanner;

public class differenceOfTwoArray {

    public static int[] getArray(int size, Scanner scn) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = getArray(n1, scn);
        int n2 = scn.nextInt();
        int[] a2 = getArray(n2, scn);

        int[] result = new int[n2];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n2 - 1;

        int c = 0;
        while (k >= 0) {
            int d = a2[j];
            if (i >= 0) {
                if (a2[j] < a1[i]) {
                    a2[j - 1]--;
                    c = 10;
                    d += c;
                } else {
                    c = 0;
                }
                d -= a1[i];
            }

            result[k] = d;
            i--;
            j--;
            k--;
        }
        for (int l = 0; l < result.length; l++) {
            if (l == 0 && result[l] == 0) {
            } else {
                System.out.println(result[l]);
            }
        }
    }
}
