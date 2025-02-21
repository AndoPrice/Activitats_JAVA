package basiques;

import java.util.Scanner;

public class Divisio2Numeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        double A = input.nextDouble();

        System.out.print("Enter num 2: ");
        double B = input.nextDouble();

        double D = A / B;
        System.out.println(D);
    }
}
