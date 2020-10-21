package Pattern;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean midU = i > 1 && i < n / 2 + 1 && j < n / 2 + 1;
                boolean midD = i < n && i > n / 2 + 1 && j > n / 2 + 1;
                boolean up = j > n / 2 + 1 && j < n && i < n / 2 + 1 || midU;
                boolean down = j > 1 && j < n / 2 + 1 && i > n / 2 + 1 || midD;
                if (up || down) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
