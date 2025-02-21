package basiques;

import java.util.Scanner;

public class Printf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String nom = input.next();

        System.out.print("Enter your age: ");
        int edat = input.nextInt();

        System.out.print("Enter your weight: ");
        float pes = input.nextFloat();

        System.out.print("Enter your blood type: ");
        char grup = input.next().charAt(0);

        System.out.print("Have you got any allergies?: ");
        boolean alergies = input.nextBoolean();

        System.out.printf("My name is %s.%nI'm %d years old.%nMy weight is %f.%nMy blood type is %c.%nAllergies: %b", nom, edat, pes, grup, alergies);
    }
}
