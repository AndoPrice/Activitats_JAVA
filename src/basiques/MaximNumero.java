package basiques;

import java.util.Scanner;

public class MaximNumero {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int a = input.nextInt();

        System.out.println("Enter Num2: ");
        int b = input.nextInt();

        if (a>b) {
            System.out.println("MAX = "+ a);
        }else{
            System.out.println("MAX = "+ b);
        }
    }
}
