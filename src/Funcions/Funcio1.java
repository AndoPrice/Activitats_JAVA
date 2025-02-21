package Funcions;

public class Funcio1 {
    public static void main(String[] args) {
        int x=10;
        imprimirNumeros(2, x);
        imprimirNumeros(x, 20);
        imprimirNumeros(2, 5);

    }

    public static void imprimirNumeros(int m, int n){
        for(int i=m; i<=n;i++){
            System.out.printf("%d%n", i);
        }
    }
}
