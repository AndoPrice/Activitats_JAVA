package ArraysBidimensionals;

import Arrays.FuncionsArray;

public class Tot {
    public static void main(String[] args) {
        int[][] matriu = {{7,2,5},{20,9,4},{2,7,15}};

        printArrayFloat(estadistiques(matriu));

    }
    public static int minim (int[][] m){
        int minim = m[0][0];
        for(int i=0;i<m.length;i++){
            for(int j = 0; j<m[0].length;j++){
                if (m[i][j]<minim){
                    minim = m[i][j];
                }
            }
        }
        return minim;
    }
    public static int maxim (int[][] m){
        int maxim = m[0][0];
        for(int i=0;i<m.length;i++){
            for(int j = 0; j<m[0].length;j++){
                if (m[i][j]>maxim){
                    maxim = m[i][j];
                }
            }
        }
        return maxim;
    }
    public static float mitjana (int[][] m){
        int num =m.length*m[0].length;
        float suma = 0f;
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[i].length;j++){
                suma+= m[i][j];
            }
        }
        return suma/num;
    }
    public static float[] estadistiques(int[][] m){
        float []e = new float[3];
        e[0]= minim(m);
        e[1]= maxim(m);
        e[2]= mitjana(m);
        return e;
    }
    public static void printArrayFloat(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%f \t", array[i]);
        }
    }
}
