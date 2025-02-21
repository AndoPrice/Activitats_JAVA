package Arrays;

import java.util.Scanner;

public class NPotenciesDeB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();
        System.out.print("Base: ");
        int b = input.nextInt();

        FuncionsArray.printArray(arrayPotenciesB(n, b));


    }
    public static int[] arrayPotenciesB(int n, int b) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(b, i);
        }
        return array;
    }
}
