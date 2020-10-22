import java.util.Scanner;

public class decimalToAny {

    public static int convert(int n, int b) {
        int convert = 0;
        int power = 1;
        while (n > 0) {
            int r = n % b;
            n /= b;
            convert += r * power;
            power *= 10;
        }

        return convert;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();

        System.out.println(convert(n, b));
    }
}
