package Arrays;

public class ZippearArray {
    public static void main(String[] args) {
        int[] a = {2,8,5,2,11,25};
        int[] b = {6,7,1,4,13,9};

        FuncionsArray.printArray(zipArrays(a, b));
    }

    public static int[] zipArrays(int[] a, int[] b){
        int[] c= new int[a.length + b.length];
        for(int i = 0; i<a.length;i++){
            c[2*i]=a[i];
        }
        for(int i = 0; i<b.length;i++){
            c[2*i+1]=b[i];
        }
        return c;
    }
}
