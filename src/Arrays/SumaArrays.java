package Arrays;

public class SumaArrays {
    public static void main(String[] args) {
        //definició i creació

        int[] a = {2,8,5,2,11,25};
        int[] b = {4,8,9};
        int[] c = {3,8,2,11,24};

        System.out.printf("La suma de l'array A és %d. \n", calculaSuma(a));
        System.out.printf("La suma de l'array B és %d. \n", calculaSuma(b));
        System.out.printf("La suma de l'array C és %d. \n", calculaSuma(c));

        System.out.printf("La mitjana de l'array A és %f. \n", calculaMitjana(a));
        System.out.printf("La mitjana de l'array B és %f. \n", calculaMitjana(b));
        System.out.printf("La mitjana de l'array C és %f. \n", calculaMitjana(c));



    }

    public static int calculaSuma (int [] array){
        int suma = 0;
        for(int i =0; i<array.length; i++){
            suma = suma + array [i];
        }
        return suma;
    }

    public static float calculaMitjana (int [] array){

        return (float) calculaSuma(array)/array.length;
    }
}
