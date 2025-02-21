package basiques;

public class ImprimirNumerosSencers {

    public static void main(String [] args) {

        int a = 101;
        int b = 0100;
        int c = 0xFace;
        int d = 0b1111;
        long e = 10000l;

        System.out.println(a+", "+b+", "+c+", "+d+", "+e);

        double numA = 1e2;
        double numB = 2.;
        double numC = .54;
        double numD = 56.4E-45;
        float numFloat = 23.59f;

        System.out.println(numA+", "+numB+", "+numC+", "+numD+", "+numFloat);

        boolean diaFestiu = true;
        boolean trobat = false;

        System.out.println(diaFestiu +", " +trobat);
    }
}
