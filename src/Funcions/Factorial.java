package Funcions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter NUM: ");
        float f=input.nextFloat();

        System.out.printf("Valor absolut de %f és %f", f, fact(f));
    }

    public static float fact(float n){
        float f=1f;
        while(n>1){
            f=f*n;
            n=n-1;
        }return f;
    }
}
