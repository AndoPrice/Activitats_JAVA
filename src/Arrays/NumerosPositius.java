package Arrays;

public class NumerosPositius {
    public static void main(String[] args) {
        int[] a = {2,-8,5,2,-11,25};
        int[] b = {-4,-8,9};
        int[] c = {3,8,-2,-11,24};

        System.out.printf("Hi ha %d números positius a l'array A. \n", numPositius(a));
        System.out.printf("Hi ha %d números positius a l'array B. \n", numPositius(b));
        System.out.printf("Hi ha %d números positius a l'array C. \n", numPositius(c));
    }
    public static int numPositius (int [] array){
        int nums = 0;
        for (int i = 0; i<array.length; i++){
            if (array [i]>0){
                nums++;
            }
        }
        return nums;
    }
}
