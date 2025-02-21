package basiques;

import java.util.Scanner;

public class ConversioTemperaturaF_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter F");
        float f = input.nextInt();

        float c = 5/9f * (f-32);

        System.out.println("La temp en C és: "+c);
    }

}
