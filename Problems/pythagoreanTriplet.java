package Problems;

import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        // We have to check for pythagorean triplet, although we do not know which one
        // is
        // 'p', which is 'b' and 'h' in (p*p) = (b*b) + (h*h)

        // Logic One

        a = a * a;
        b = b * b;
        c = c * c;

        boolean triplet1 = ((a == (b + c)) || (b == (a + c)) || c == (a + b));

        System.out.println(triplet1);

        // Logic Two

        int max = a * a;
        int sum = (b * b + c * c);
        if (b * b > max) {
            max = b;
            sum = (a * a + c * c);
        }
        if (c * c > max) {
            max = c;
            sum = (a * a + b * b);
        }

        boolean triplet2 = (max == sum);
        System.out.println(triplet2);

        in.close();
    }
}
