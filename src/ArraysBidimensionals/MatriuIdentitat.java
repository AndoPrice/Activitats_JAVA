package ArraysBidimensionals;

public class MatriuIdentitat {
    public static void main(String[] args) {
        int a = 4;
        BasicBidimensional.imprimir(identitat(a));
    }
    public static int[][] identitat (int a){
        int[][] m = new  int[a][a];
        for(int i = 0; i<m.length;i++){
            m[i][i]=1;
        }
        return m;
    }
}
