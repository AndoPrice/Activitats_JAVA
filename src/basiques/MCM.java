package basiques;

import java.util.Scanner;

public class MCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número 1: ");
        int a = input.nextInt();

        System.out.print("Número 2: ");
        int b = input.nextInt();

        int x = 0;

        if (a > b) {
            x = a;
        } else {
            x = b;
        }
        while (x % a != 0 || x % b != 0) {
            x++;
        }
        System.out.printf("MCM és: %d", x);
    }
}
