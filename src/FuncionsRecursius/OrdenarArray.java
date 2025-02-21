package FuncionsRecursius;

public class OrdenarArray {
    public static void main(String[] args) {
        int[]nums = {7,9,1,3,8,2};
        sort2(nums, nums.length-1);
        printArray(nums);
    }
    public static int posMin(int[] array, int start){
        int valorMinim = array[start];
        int posicioMinim = start;
        for(int i=start+1; i< array.length;i++){
            if(array[i]<valorMinim){
                valorMinim=array[i];
                posicioMinim= i;
            }
        }
        return posicioMinim;
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length;i++){
            System.out.printf("%d:%d\n", i, array[i]);
        }
    }
    public static void sort(int[] array, int start){
        if(start<array.length-1){
            int pMin = posMin(array, start);
            int temp = array[start];
            array[start]=array[pMin];
            array[pMin] = temp;
           sort(array, start +1);
        }
    }


    public static int posMax(int[] array, int end) {
        int valorMax = array[0];
        int posicioMax = 0;
        for (int i = 1; i <= end; i++) {
            if (array[i] > valorMax) {
                valorMax = array[i];
                posicioMax = i;
            }
        }
        return posicioMax;
    }

    public static void sort2(int[] array, int end){
        if(end>0){
            int pMax = posMax(array, end);
            int temp = array[end];
            array[end]=array[pMax];
            array[pMax] = temp;
            sort2(array, end-1);
        }
    }

}