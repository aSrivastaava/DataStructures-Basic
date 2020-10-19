// to print
// *
// * *
// * * *
// * * * *
// * * * * *

package Pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}
