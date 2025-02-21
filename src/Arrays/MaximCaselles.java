package Arrays;

public class MaximCaselles {
    public static void main(String[] args) {
        int[] a = {2,-8,5,2,-11,25};
        int[] b = {-4,-8,9};
        int[] c = {3,8,-2,-11,24};

        System.out.printf("El màxim de l'array A és %d. \n", maxim(a));
        System.out.printf("El màxim de l'array B és %d. \n", maxim(b));
        System.out.printf("El màxim de l'array C és %d. \n", maxim(c));

        System.out.printf("El mínim de l'array A és %d. \n", minim(a));
    }
    public static int maxim (int[] array){
        int max =0;
        for (int i=0; i<array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static int minim (int[] array){
        int min =Integer.MAX_VALUE;
        for (int i=0; i<array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
