package Arrays;

public class ExtendArray {
    public static void main(String[] args) {
        int[] a = {2,8,5,3,11,25};

        System.out.printf("L'extend és %d", extend(a));
    }
    public static int extend (int[] a){
        int max = MaximCaselles.maxim(a);
        int min = MaximCaselles.minim(a);

        int extend = max - min;
        return extend;
    }
}
