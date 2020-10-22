import java.util.Scanner;

public class anyToAny {

    public static int toDecimal(int n, int base) {
        int result = 0;
        int power = 1;

        while (n > 0) {
            int r = n % 10;
            n /= 10;

            result += r * power;
            power *= base;
        }

        return result;
    }

    public static int decimalTo(int n, int base) {
        int result = 0;
        int power = 1;

        while (n > 0) {
            int r = n % base;
            n /= base;

            result += r * power;
            power *= 10;
        }

        return result;
    }

    public static int convertNumber(int n, int b1, int b2) {
        int decimal = toDecimal(n, b1);
        int result = decimalTo(decimal, b2);
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        scn.close();

        System.out.println(convertNumber(n, b1, b2));
    }
}
