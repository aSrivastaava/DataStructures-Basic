public class Conditions {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 5;

        // Comparing two numbers using if else statement.

        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " is greater than " + n2);
            } else {
                System.out.println(n1 + " is smaller than " + n2);
            }
        }

        // Comparing two numbers using nested if statement.

        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else {
            System.out.println(n1 + " is smaller than " + n2);
        }
    }
}
