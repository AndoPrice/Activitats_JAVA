package basiques;

import java.util.Scanner;

public class MitjanaInfinita {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float suma = 0;
        int i = 0;
        do {
            System.out.print("Número: ");
            float n = input.nextFloat();
            if(n==0){break;}
            suma +=n;
            i++;
        }while (true);
        float mitjana = suma/i;
        System.out.printf("La mitjana és %f",mitjana);
    }
}
