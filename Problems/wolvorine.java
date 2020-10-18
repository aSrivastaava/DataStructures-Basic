package Problems;

import java.util.*;

public class wolvorine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt(), n, total, opp;

        for (int i = 0; i < t; i++) {
            n = scn.nextInt();
            total = 0;

            if (n % 2 != 0)
                System.out.println(0);
            else {

                for (int j = 2; j * j <= n; j++) {

                    if (j * j == n) {
                        total++;
                    } else {
                        if (n % j == 0) {
                            if (j % 2 == 0)
                                total++;

                            opp = n / j;
                            if (n % opp == 0 && opp % 2 == 0) {
                                total++;
                            }
                        }
                    }
                }
                total++;
                System.out.println(total);
            }
        }
        scn.close();
    }
}
