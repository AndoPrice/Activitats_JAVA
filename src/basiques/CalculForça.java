package basiques;

import java.util.Scanner;

public class CalculForça {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter m: ");
        double m = input.nextDouble();

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        double f = m * a;
        System.out.println("La força és: " + f + "N");
    }
}
