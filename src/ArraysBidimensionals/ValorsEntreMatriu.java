package ArraysBidimensionals;

public class ValorsEntreMatriu {
    public static void main(String[] args) {
        int[][] m = {{2,4,5},{1,7,3,},{0,5,1}};
        int min = 0;
        int max = 5;

        imprimirValorsEntre(m, min, max);
    }

    public static void imprimirValorsEntre (int[][] m, int a, int b){
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[i].length; j++){
                if(m[i][j]>=a&& m[i][j]<=b){
                    System.out.printf("%d\t", m[i][j]);
                }
            }
        }
    }
}
