package Arrays;

public class AjuntarArrays {
    public static void main(String[] args) {
        int[] a = {2,8,5,2,11,25};
        int[] b = {6,7,1,4,13,9,30,3,8};

        FuncionsArray.printArray(ajuntarArrays(a, b));
    }

    public static int [] ajuntarArrays(int [] a, int[] b){
        int [] c = new int[a.length + b.length];
        for (int i = 0; i<a.length;i++){
            c[i]=a[i];
        }
        for(int i = 0; i<b.length; i++){
            c[a.length+i] = b[i];
        }
        return c;
    }
}
