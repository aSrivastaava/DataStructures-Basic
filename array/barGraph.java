package array;

import java.util.Scanner;

/**
 * barGraph
 */
public class barGraph {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        scn.close();
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i > arr[j]) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }

    }
}