package basiques;

import java.util.Scanner;

public class CalculMRU {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter X0: ");
        double x0 = input.nextDouble();

        System.out.print("Enter V: ");
        double V = input.nextDouble();

        System.out.print("Enter t: ");
        double t = input.nextDouble();

        double x = x0 + (t * V);
        System.out.println("La posició final és: "+ x + "m");
    }
}
