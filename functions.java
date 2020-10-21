import java.util.Scanner;

public class functions {

    public static int fact(int x) {
        int result = 1;

        for (int i = 1; i <= x; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scn.nextInt();
        System.out.println("Enter the value of r");
        int r = scn.nextInt();

        scn.close();
        int nfact = fact(n);

        int nmrfact = fact(n - r);

        int npr = nfact / nmrfact;
        System.out.println(npr);

    }
}
