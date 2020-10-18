package Problems;

import java.util.Scanner;

public class goku {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer res = new StringBuffer();
        int t = in.nextInt();

        while (t-- > 0) {
            // int total = 0;
            int[] count = new int[1001];
            int N = in.nextInt();

            boolean canDestroy = true;
            for (int i = 0; i < N; i++) {
                int c = in.nextInt();
                if (c <= N)
                    count[c]++;
                else {
                    canDestroy = false;
                    // break;
                }
            }

            while (N > 0 && canDestroy) {
                if (count[N] > 0) {
                    N = N - count[N];
                } else {
                    canDestroy = false;
                    break;
                }
            }

            if (canDestroy)
                res.append("YES" + "\n");
            else
                res.append("NO \n");

        }

        System.out.println(res);
        in.close();

    }

}
