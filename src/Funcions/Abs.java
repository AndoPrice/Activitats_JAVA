package Funcions;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter NUM: ");
        float f=input.nextFloat();

        System.out.printf("Valor absolut de %f és %f", f, absolut(f));
    }

    public static float absolut(float n){
        if(n>=0){
            return n;
        } else{
            return -n;
        }
    }


}
