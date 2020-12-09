package dimentionalarray;

import java.util.Scanner;

/**
 * waveTraversal
 */
public class waveTraversal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        scn.close();

        for (int i = 0; i < m; i++) {
            if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mat[j][i] + "\t");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[j][i] + "\t");
                }
            }
            System.out.println();
        }
    }
}