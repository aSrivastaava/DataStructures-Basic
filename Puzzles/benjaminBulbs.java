package Puzzles;

import java.util.Scanner;

public class benjaminBulbs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nob = in.nextInt();
        in.close();

        // Logic One (but takes more time)

        for (int n = 1; n <= nob; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                System.out.println(n);
            }

        }

        // Or

        // Logic Two (prints perfect square)

        for (int i = 1; i * i <= nob; i++) {
            System.out.println(i * i);
        }
    }
}
