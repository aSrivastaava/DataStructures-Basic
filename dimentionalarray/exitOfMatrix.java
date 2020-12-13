package dimentionalarray;

import java.util.Scanner;

public class exitOfMatrix {
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

        // 0 = east, 1 = south, 2 = west, 3 = north
        int dir = 0;

        int i = 0;
        int j = 0;

        while (true) {

            dir = (dir + mat[i][j]) % 4;

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == mat.length) {
                i--;
                break;
            } else if (j == mat[0].length) {
                j--;
                break;
            }

        }

        System.out.println(i);
        System.out.println(j);
    }
}
