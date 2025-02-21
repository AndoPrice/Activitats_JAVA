package basiques;

import java.util.Scanner;

import static java.lang.Math.round;

public class Nota {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter nota: ");
        double n = input.nextDouble();
        n = round(n);

        if (n >= 0 && n < 5) {
            System.out.println("SUSPÈS");
        } else if (n >= 5 && n < 6) {
            System.out.println("SUFICIENT");
        } else if (n >= 6 && n < 7) {
            System.out.println("BÉ");
        } else if (n >= 7 && n < 9) {
            System.out.println("NOTABLE");
        } else if (n >= 9 && n < 10) {
            System.out.println("EXCELENT");
        } else{
            System.out.println("NO VÀLID");
        }
    }
}