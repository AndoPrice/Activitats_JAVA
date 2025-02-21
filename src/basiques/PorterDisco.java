package basiques;

import java.util.Scanner;

public class PorterDisco {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter edat: ");
        int a = input.nextInt();

        String m = (a>=18) ? "Enter" : "Do not enter";
        System.out.println (m);

    }
}
