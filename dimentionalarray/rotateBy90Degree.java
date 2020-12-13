package dimentionalarray;

import java.util.Scanner;

public class rotateBy90Degree {
    public static void display(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        System.out.println("Select Version:\n1:Using Direct approach.\n2:Using Transpose then reverse col approach.");
        int cho = scn.nextInt();

        scn.close();

        if (cho == 1) {
            int[][] newMat = new int[n][n];

            for (int i = 0; i < newMat.length; i++) {
                for (int j = 0; j < newMat[0].length; j++) {
                    newMat[i][j] = mat[(n - 1) - j][i];
                }
            }

            display(newMat);
        } else if (cho == 2) {
            // Transpose
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j <= i; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            // reverse column
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][(n - 1) - j];
                    mat[i][(n - 1) - j] = temp;
                }
            }

            display(mat);
        } else {
            System.out.println("Error choosing. Try running the code again.");
        }
    }
}
