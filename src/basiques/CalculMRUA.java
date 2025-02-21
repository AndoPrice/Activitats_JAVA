package basiques;

import java.util.Scanner;

public class CalculMRUA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter X0: ");
        double X0 = input.nextDouble();

        System.out.print("Enter V0: ");
        double V0 = input.nextDouble();

        System.out.print("Enter t: ");
        double t = input.nextDouble();

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        double x = X0 + V0*t + 0.5*a*(t*t);
        System.out.println("La posició final és: "+ x + "m");

        double v = V0 + a*t;
        System.out.println("La velocitat final és: "+ v + "m/s");
    }
}
