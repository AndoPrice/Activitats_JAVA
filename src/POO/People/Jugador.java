package POO.People;

public class Jugador extends Persona{
    String nomEquip;
    int numGols;
    String pos;

    public Jugador(String nom, int edat, SEXE sexe, String nomEquip, int numGols, String pos) {
        super(nom, edat, sexe);
        this.nomEquip = nomEquip;
        this.numGols = numGols;
        this.pos = pos;
    }

    public String getNomEquip() {
        return nomEquip;
    }

    public void setNomEquip(String nomEquip) {
        this.nomEquip = nomEquip;
    }

    public int getNumGols() {
        return numGols;
    }

    public void setNumGols(int numGols) {
        this.numGols = numGols;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void print(){
        System.out.printf("El jugador %s te %d anys, és de sexe: %s. Juga per l'equip %s a la posició: %s i ha marcat %d gols\n",
                nom, edat, sexe, nomEquip, pos, numGols);
    }
}
