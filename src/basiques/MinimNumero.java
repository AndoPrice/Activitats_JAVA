package basiques;

import java.util.Scanner;

public class MinimNumero {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int a = input.nextInt();

        System.out.println("Enter Num2: ");
        int b = input.nextInt();

        String m = (a<b) ? "Min is: " + a : "Min is: " + b;
        System.out.println (m);
    }
}
