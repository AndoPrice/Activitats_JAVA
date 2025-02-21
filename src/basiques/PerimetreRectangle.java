package basiques;

import java.util.Scanner;

public class PerimetreRectangle {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter side A: ");
        double A = input.nextDouble();

        System.out.print("Enter side B: ");
        double B = input.nextDouble();

        Double P = 2*A + 2*B;
        System.out.println(P);
    }
}
