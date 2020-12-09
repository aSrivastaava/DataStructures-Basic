package dimentionalarray;

import java.util.Scanner;

public class spiralTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        scn.close();

        int minr = 0;
        int minc = 0;

        int maxr = mat.length - 1;
        int maxc = mat[0].length - 1;

        int tc = n * m;

        int count = 0;

        while (count < tc) {

            // left
            for (int i = minr, j = minc; i <= maxr && count < tc; i++) {
                System.out.println(mat[i][j]);
                count++;
            }
            minc++;

            // bottom
            for (int i = maxr, j = minc; j <= maxc && count < tc; j++) {
                System.out.println(mat[i][j]);
                count++;
            }
            maxr--;

            // right
            for (int i = maxr, j = maxc; i >= minr && count < tc; i--) {
                System.out.println(mat[i][j]);
                count++;
            }
            maxc--;

            // top
            for (int i = minr, j = maxc; j >= minc && count < tc; j--) {
                System.out.println(mat[i][j]);
                count++;
            }
            minr++;

        }

    }
}
