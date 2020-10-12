public class Variable {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;

        System.out.println("Sum of " + x + " and " + y + " is " + sum);

        int prod = x * y;

        System.out.println("Product of " + x + " and " + y + " is " + prod);

        int divxy = x / y;
        int divyx = y / x;
        int mod = x % y;

        System.out.println("Division of " + x + " and " + y + " is " + divxy);
        System.out.println("Division of " + y + " and " + x + " is " + divyx);
        System.out.println("Modulus of " + x + " and " + y + " is " + mod);

        // Evaluating expression xy/(x+y)

        int ex = (x * y) / (x + y);

        System.out.println("Solution of expression " + x + " * " + y + " / " + x + " + " + y + " is " + ex);

        System.out.println(Math.pow(2, 3));

        int exp = (int) Math.pow(2, 3);
        System.out.println(exp);
    }
}
