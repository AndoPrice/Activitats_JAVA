package ArraysBidimensionals;

public class MatriusIguals {
    public static void main(String[] args) {
        int[][] matriuA = {{2,4,5},{1,7,3,},{0,5,1}};
        int[][] matriuB = {{2,4,5},{1,7,3,},{0,5,1}};

        System.out.printf(("%b"), iguals(matriuA,matriuB));
    }
    public static boolean iguals (int[][] m1, int[][] m2){
        boolean iguals = true;
        for(int i = 0; i<m1.length; i++){
            for(int j = 0; j<m1[0].length; j++){
                if ( m1[i][j]!= m2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
