package basiques;

public class ExEnumeracions {

    static enum Sexe {HOME,DONA,M,F};
    static enum EstatCivil {SOLTER,CASAT,DIVORCIAT};

    public static void main(String[] args){
        Sexe a=Sexe.HOME;
        Sexe b =Sexe.DONA;
        EstatCivil c =EstatCivil.CASAT;

        System.out.println(a+", "+b+", "+c);

    }
}
