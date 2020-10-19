// to print
//                  *
//              *   *
//          *   *   *
//      *   *   *   *
// *    *   *   *   *
package Pattern;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int sp = (n - 1), st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
            sp--;
            st++;
        }
    }
}
