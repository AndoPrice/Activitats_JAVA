package Arrays;

import java.util.Scanner;

public class ArrayCustomized {
    public static void main(String[] args) {

        int[] nums;

        Scanner input = new Scanner(System.in);
        System.out.print("Mínim: ");
        int mi = input.nextInt();
        System.out.print("Màxim: ");
        int ma = input.nextInt();
        int n =ma-mi+1;

        //Instalació /Construcció
        nums = new int[n];

        //Emplenar amb valors aleatoris
        for (int i = 0; i < nums.length; i++) {
            nums[i] = mi +i;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d. \n", nums[i]);
        }
    }
}
