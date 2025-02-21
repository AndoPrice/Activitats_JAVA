package Funcions;

import java.util.Scanner;

public class FuncioConversioTempC_F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter C: ");
        float c = input.nextFloat();

        System.out.printf("%f passat a Fahrenheit és: %f", c, conversio(c));
    }

    public static float conversio(float c){
        float f  = (c*(9/5f))+32f;
        return f;
    }
}
