package FuncionsRecursius;

public class Potencia {
    public static void main(String[] args) {
        System.out.println(potencies(2,6));
        System.out.print(potencies(2,7));

    }
    public static int potencies (int b, int e){
        if(e==0){
            return 1;
        }
        else{
            return b*potencies(b,e-1);
        }
    }
    public static int potencia2(int b, int e){
        if(e==0){
            return 1;
        }
        else if (e%2==0){
            return potencia2(b,e/2)*potencia2(b,e/2);
        }
        else{
            return b*potencia2(b, e/2)*potencia2(b,e/2);
        }
    }
}
