package Funcions;

import java.util.Scanner;

public class FuncioMCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a=input.nextInt();

        System.out.print("Enter B: ");
        int b=input.nextInt();

        int d = MCD (a,b);
        System.out.printf("MCD és %d", d);
    }

    public static int MCD(int a, int b){

        int x =0;

        if (a>b){
            x = b;
        }else{
            x=a;
        }
        while(b%x!=0 || a%x!=0){
            x--;
        }
        return x;
    }

}
