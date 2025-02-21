package Arrays;

public class Suma2Arrays {
    public static void main(String[] args) {
        int[] a = {2,8,5,2,11,25};
        int[] b = {6,7,1,4,13,9,30,3,8};

        System.out.printf("La suma dels arrays  és %d. ", calculaSuma(a, b));


    }

    public static int calculaSuma (int [] a, int [] b) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        for (int i = 0; i < b.length; i++) {
            suma = suma + b[i];
        }
        return suma;
    }
}
