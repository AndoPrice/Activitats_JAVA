package Arrays;

public class PracticeArray {
    public static void main(String[] args) {

        //Definició i creació
        String[] noms = {"Pozo", "Lian", "Ando", "Louisma"};


        //recorregut Ascendent
        for (int i = 0; i < noms.length; i++) {
            System.out.printf("%s. \n", noms[i]);

        }

        //recorregut descendent
        for (int i = noms.length - 1; i >= 0; i--) {
            System.out.printf("%s. \n", noms[i]);

        }
    }
}
