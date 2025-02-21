package Arrays;

public class ParellsArray {
    public static void main(String[] args) {
        int[] a = {2,8,5,14,11,25};

        System.out.printf("Hi ha %d números parells", numParells(a));
    }

    public static int numParells(int[] a){
        int sum= 0;
        for(int i= 0; i<a.length; i++){
            if (a[i]%2==0){
                sum++;
            }
        }
        return sum;
    }
}
