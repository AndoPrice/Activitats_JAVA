package Funcions;

import java.util.Scanner;

public class TaulaMultiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int num = input.nextInt();

        taulaMultiplicar(num);
    }

    public static void taulaMultiplicar(int n){
        System.out.printf("Taula de Multiplicar del número %d. \n", n);
        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d \n", i, n, i*n);
        }
    }
}
