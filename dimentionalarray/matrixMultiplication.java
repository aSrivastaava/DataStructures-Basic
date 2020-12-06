package dimentionalarray;

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // For Matrix one
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        int[][] mat1 = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = scn.nextInt();
            }
        }

        // For matrix two.
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        int[][] mat2 = new int[r2][c2];

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = scn.nextInt();
            }
        }

        scn.close();

        if (c1 != r2) {
            System.out.println("Invalid input");
            return;
        }

        int[][] mul = new int[r1][c2];
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[0].length; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
