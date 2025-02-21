package Arrays;

public class InvertirArray {
    public static void main(String[] args) {
        int[] a = {2,8,5,2,11,25};

        FuncionsArray.printArray(invertirArray(a));
    }

    public static int[] invertirArray (int[] a){
        int[] invertit = new int[a.length];
        for(int i=0; i<a.length;i++){
            invertit [i] = a[a.length-i-1];
        }
        return invertit;
    }
}
