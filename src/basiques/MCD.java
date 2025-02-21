package basiques;

import java.util.Scanner;

public class MCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número 1: ");
        int a = input.nextInt();

        System.out.print("Número 2: ");
        int b = input.nextInt();

        int x=0;

        if (a>b){
            x = b;
        }else{
            x=a;
        }
        while(b%x!=0 || a%x!=0){
            x--;
        }
        System.out.printf("MCD és: %d", x);



    }
}
