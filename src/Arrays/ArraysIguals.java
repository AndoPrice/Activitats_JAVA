package Arrays;

public class ArraysIguals {
    public static void main(String[] args) {
        int[] a = {2,8,5,2,11,25};
        int[] b = {2,8,5,2,11,25};

        System.out.printf("Igual = %b", arraysIguals(a,b));
    }

    public static boolean arraysIguals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            boolean iguals = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    iguals = false;
                    break;
                }
            }
            return iguals;
        }
    }
}
