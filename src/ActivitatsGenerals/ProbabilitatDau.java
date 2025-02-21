package ActivitatsGenerals;

public class ProbabilitatDau {
    public static void main(String[] args) {
        int[] experiments = {100, 1000, 1000000};
        float[][] probabilitats = simulacioTirades(experiments);
        imprimir(probabilitats, experiments);

    }

    public static float[][] simulacioTirades (int[] experiments){
        float [][] probabilitats = new float[experiments.length][6];

        for (int i = 0; i< experiments.length; i++){
            int nombreTirades = experiments[i];
            int [] comptador = new int[6];

            for(int j = 0; j<nombreTirades;j++){
                int caraAleatoria = (int) (1 + Math.floor(Math.random()*6));
                comptador[caraAleatoria-1]++;
            }

            for(int k =0; k<6; k++){
                probabilitats[i][k] = (float) comptador[k]/nombreTirades;
            }
        }
        return probabilitats;
    }

    public static void imprimir (float[][] probabilitats, int[] experiments) {
        System.out.println("Probabilitats per a cada experiment:");
        for (int i = 0; i < probabilitats.length; i++) {
            System.out.printf("Experiment amb %d tirades:\n", experiments[i]);
            for (int j = 0; j < probabilitats[i].length; j++) {
                System.out.printf("Cara %d: %.6f\n", j + 1, probabilitats[i][j]);
            }
            System.out.println();
        }

    }
}
