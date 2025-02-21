package Funcions;

import java.util.Scanner;

public class Funcio2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter A: ");
        int x=input.nextInt();

        System.out.print("Enter B: ");
        int y=input.nextInt();

        int r = sumaNumeros(x,y);
        System.out.printf("la suma de %d i %d és %d", x,y,r);
    }

    public static int sumaNumeros(int a, int b){
        int s = a + b;
        return s;
    }
}
