package basiques;

import java.util.Scanner;

public class ConversioTemperaturaC_F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter C: ");
        float c = input.nextInt();

        float f = (c * 9/5f) +32;

        System.out.println("La temp en C és: "+f);
    }

}
