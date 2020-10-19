// to print
//  *   *   *       *   *   *
//  *   *               *   *
//  *                       *
//  *   *               *   *
//  *   *   *       *   *   *
package Pattern;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int sp = 1, st = n + 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= st / 2; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st / 2; j++) {
                System.out.print("*\t");
            }

            System.out.println();
            if (i <= n / 2) {
                sp += 2;
                st -= 2;
            } else {
                sp -= 2;
                st += 2;
            }
        }
    }
}
