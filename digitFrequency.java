import java.util.Scanner;

public class digitFrequency {

    public static int freq(int n, int x) {
        int result = 0;

        while (n > 0) {
            int a = n % 10;
            n /= 10;
            if (a == x) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = scn.nextInt();
        scn.close();
        int res = freq(n, s);
        System.out.println(res);
    }
}
