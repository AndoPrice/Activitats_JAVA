package Funcions;

import java.util.Scanner;

public class FuncioMinim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a=input.nextInt();

        System.out.print("Enter B: ");
        int b=input.nextInt();

        int m = minim(a,b);
        System.out.printf("El mínim és %d", m);
    }
    public static int minim (int a, int b){
        if (a<b){
            int c=a;
            return c;
        }else{
            int c=b;
            return c;
        }

    }



}
