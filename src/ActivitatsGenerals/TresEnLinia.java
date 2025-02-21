package ActivitatsGenerals;

import java.security.PublicKey;
import java.util.Scanner;

public class TresEnLinia {

    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR [][] tauler;

    public enum RESULTAT {EMPAT, GUANYADOR_A, GUANYADOR_B, ENJOC};
    public static RESULTAT resultat;

    public enum TORN {JUGADOR_A, JUGADOR_B}
    public static TORN torn;

    public static int numTirades;

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        inicialitzaPartida();
        /* (PROVA) tauler[0][1] = VALOR.CREU;
        tauler[1][2] = VALOR.CERCLE; */
        mostrarTauler(tauler);
        while(!partidaAcabada()){
            ferTirada(input, torn, tauler);
            mostrarTauler(tauler);
            resultat = comprovaResultat(tauler);
            torn = canviaTorn(torn);

        }

        mostrarResultat(resultat);

    }

    public static void inicialitzaPartida(){
        tauler = new VALOR[3][3];
        for(int i= 0; i< tauler.length;i++){
            for(int j = 0; j< tauler[i].length; j++){
                tauler[i][j]= VALOR.BUIDA;
            }
        }
        torn = TORN.JUGADOR_A;
        resultat= RESULTAT.ENJOC;

        numTirades = 0;
    }

    public static void mostrarTauler(VALOR[][] t){
        for(int i= 0; i< t.length;i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print("|");
                switch (t[i][j]){
                    case BUIDA: System.out.print(" "); break;
                    case CREU: System.out.print("X"); break;
                    case CERCLE: System.out.print("O"); break;

                }
            }
            System.out.println("|");
        }
    }

    public static boolean partidaAcabada (){
        return resultat != RESULTAT.ENJOC;
    }
    public static void ferTirada  (Scanner input, TORN t, VALOR[][] tauler){
        int fila, col;

        do {
            System.out.print("Fila:");
            fila = input.nextInt();

            System.out.print("Columna:");
            col = input.nextInt();
        }while(! tiradaValida(fila, col, tauler));

        tauler[fila][col] = (t==TORN.JUGADOR_A)? VALOR.CREU : VALOR.CERCLE;

        numTirades++;

    }

    public static boolean tiradaValida(int f, int c, VALOR[][] t){
        return(f>=0 && f<=2 && c>=0 && c<=2 && t[f][c] == VALOR.BUIDA);
    }

    public static TORN canviaTorn(TORN t){
        if (t==TORN.JUGADOR_A){
            return TORN.JUGADOR_B;
        }
        else {
            return TORN.JUGADOR_A;
        }
    }

    public static RESULTAT comprovaResultat(VALOR[][] t ){
        for(int f = 0; f<=2; f++){
            if(t[f][0]==t[f][1]&&t[f][1]==t[f][2] && t[f][0]!=VALOR.BUIDA);
        }

        return RESULTAT.ENJOC;
    }

    public static void mostrarResultat (RESULTAT r){
        if(r==RESULTAT.EMPAT){
            System.out.println("Partida acabada en empat!!");
        } else if(r==RESULTAT.GUANYADOR_A) {
            System.out.println("Enhorabona jugador/a A!!");
        } else if(r==RESULTAT.GUANYADOR_B) {
            System.out.println("Enhorabona jugador/a B!!");
        }
        else {
            System.out.println("La partida segueix en joc...!!");
        }

    }
}