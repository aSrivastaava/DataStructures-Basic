// to print
//  *
//      *
//          *
//              *
//                  *

package Pattern;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            System.out.println("*");
            sp++;
        }
    }
}
