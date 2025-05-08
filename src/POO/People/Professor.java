package POO.People;

public class Professor extends Persona{
    int anysDocent;
    String departament;
    Professor(String n, int e, SEXE s,int a, String d){
        super(n,e,s);
        this.anysDocent = a;
        this.departament= d;
    }

    public int getAnysDocent() {
        return anysDocent;
    }

    public void setAnysDocent(int anysDocent) {
        this.anysDocent = anysDocent;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void print(){
        System.out.printf("%s te %d anys , és de sexe: %s. Du %s de docent i és del departament: %s.\n", nom, edat, sexe,anysDocent,departament);

    }
}
