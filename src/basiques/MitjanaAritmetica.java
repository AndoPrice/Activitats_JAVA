package basiques;

import java.util.Scanner;

public class MitjanaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        double a = input.nextDouble();

        System.out.print("Enter B: ");
        double b = input.nextDouble();

        System.out.print("Enter C: ");
        double c = input.nextDouble();

        double m = (a + b + c)/3.0;
        System.out.println("La mitjana és "+m);
    }
}
