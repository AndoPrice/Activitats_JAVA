package Arrays;

import java.util.Scanner;

public class NPotencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();

        FuncionsArray.printArray(arrayPotencies2(n));


    }
    public static int[] arrayPotencies2(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(2, i + 1);
        }
        return array;
    }
}