import java.util.Scanner;

public class anyToDecimal {

    public static int decimalConvert(int n, int b) {
        int result = 0;
        int power = 1;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            result += rem * power;
            power *= b;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();

        System.out.println(decimalConvert(n, b));
    }
}
