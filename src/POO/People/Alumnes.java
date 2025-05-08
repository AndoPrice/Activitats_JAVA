package POO.People;

public class Alumnes extends Persona{
    int curs;
    char grup;


    public Alumnes(String nom, int edat, SEXE sexe, int curs, char grup) {
        super(nom, edat, sexe);
        this.curs = curs;
        this.grup = grup;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public char getGrup() {
        return grup;
    }

    public void setGrup(char grup) {
        this.grup = grup;
    }

    @Override
    public void print() {
        System.out.printf("%s va a %d - %c. %n", nom, curs, grup);
    }
}
