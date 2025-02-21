package Funcions;

import java.util.Scanner;

public class FuncioPerimetreRectangle {
    public static void main(String[] args) {
            Scanner input =  new Scanner(System.in);

            System.out.print("Enter A: ");
            int a=input.nextInt();

            System.out.print("Enter B: ");
            int b=input.nextInt();

            int r = calculPerimetre(a,b);
            System.out.printf("El perímetre és %d",r);
        }

        public static int calculPerimetre(int a, int b){
            int p = 2*a + 2*b;
            return p;
    }
}
