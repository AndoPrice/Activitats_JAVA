package Arrays;

import java.util.Scanner;

public class FuncionsArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Mínim: ");
        int a = input.nextInt();
        System.out.print("Màxim: ");
        int b = input.nextInt();

        printArray (copiaArray(numsArray(a,b)));

        printArray(numsArray(a,b));

        printArray(subArray(copiaArray(numsArray(a,b)), 5, 7));

    }

    public static int[] numsArray(int a, int b) {
        int[] array = new int[b - a + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = a + i;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d: %d \n", i, array[i]);
        }
    }

    public static int[] copiaArray (int[] array){
        int[] copia = new int[array.length];

        for(int i =0; i< array.length;i++){
            copia[i] = array[i];
        }
        return copia;
    }
    public static int[] subArray (int[] array, int a, int b){
        int[] copia = new int[b-a+1];

        for(int i =0; i< copia.length;i++){
            copia[i] = array[a+i];
        }
        return copia;
    }

}
