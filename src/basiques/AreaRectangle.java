package basiques;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double Side1 = input.nextDouble();

        System.out.print("Enter side 2: ");
        double Side2 = input.nextDouble();

        double A = Side1 * Side2;
        System.out.println(A);

    }
}
