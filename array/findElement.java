package array;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        int search = -1;
        scn.close();

        for (int i = 0; i < arr.length; i++) {
            if (d == arr[i]) {
                search = i;
                break;
            }
        }
        System.out.println(search);
    }
}
