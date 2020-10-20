package Pattern;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int sp = n / 2, st = 1, row = 1;
        for (int i = 1; i <= n; i++) {
            int col = 0;
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(row + col + "\t");
                if (j <= st / 2) {
                    col++;
                } else {
                    col--;
                }
            }
            System.out.println();

            if (i <= n / 2) {
                sp--;
                st += 2;
                row++;
            } else {
                sp++;
                st -= 2;
                row--;
            }
        }
    }
}
