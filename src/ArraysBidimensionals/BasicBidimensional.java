package ArraysBidimensionals;

public class BasicBidimensional {
    public static void main(String[] args) {
        char[][] meuArray = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };
        int [][] matriuA = {{2,3,4},{1,0,5}};
        int [][] matriuB = {{4,0,1},{3,2,0}};

        imprimir(sumaMatrius(matriuA, matriuB));



        //Recorregut per files
        for (int f = 0; f < meuArray.length; f++) {
            for (int c = 0; c < meuArray[0].length; c++) {
                System.out.printf("%c \t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        for (int c = 0; c < meuArray[0].length; c++) {
            for (int f = 0; f < meuArray.length; f++) {
                System.out.printf("%c \t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        for(int f = 0;f<meuArray.length;f++){
            System.out.printf("%c \t", meuArray[f][f]);
        }
        System.out.printf("\n\n");

        for(int f =2, c=0; f>=0&& c< meuArray.length; f--,c++){
            System.out.printf("%c \t", meuArray[f][c]);

        }
    }

    public static int[][] sumaMatrius(int[][] m1,int[][] m2 ){
        int[][] m = new int[m1.length][m1[0].length];
        for (int i = 0; i< m1.length; i++){
            for(int j =0; j <m1[0].length; j++){
                m[i][j]= m1[i][j] + m2[i][j];
            }
        }
        return m;
    }
    public static void imprimir(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

