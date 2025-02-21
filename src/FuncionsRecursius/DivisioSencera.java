package FuncionsRecursius;

public class DivisioSencera {
    public static void main(String[] args) {
        System.out.print(divisio(12,3));

    }
    public static int divisio (int a, int b){
        if (a<b){
            return 0;
        }
        else{
            return 1 + divisio(a-b,b);
        }
    }
}
