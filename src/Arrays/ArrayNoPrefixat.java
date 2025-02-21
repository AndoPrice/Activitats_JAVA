package Arrays;

import java.util.Scanner;

public class ArrayNoPrefixat {
    public static void main(String[] args) {
        double[] nums;

        Scanner input = new Scanner(System.in);
        System.out.print("Num Caselles: ");
        int n = input.nextInt();

        //Instalació /Construcció
        nums = new double[n];

        //Emplenar amb valors aleatoris
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 10 + Math.random() * 20;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%f. \n", nums[i]);
        }
    }
}