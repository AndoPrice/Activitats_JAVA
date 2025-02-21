package Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {2,8,5,3,11,25};
        sortArray(a);
        FuncionsArray.printArray(a);

    }

    public static void sortArray(int[] a){

        boolean ordenat= false;
        while(!ordenat){
            ordenat=true;
            for(int i=0; i<a.length-1;i++){
                if (a[i]>a[i+1]){
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i +1] = temp;
                    ordenat = false;
                }
            }
        }
    }
}
