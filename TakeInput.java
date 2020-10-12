import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        System.out.println("Dear " + name + ". Here's your counting.");
        for (int i = 1; i <= x; i++)
            System.out.println(i);

        scn.close();
    }
}
