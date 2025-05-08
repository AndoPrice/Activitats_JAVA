package POO.People;

public class Main {
    public static void main(String[] args) {
        Alumnes a1, a2;
        a1 = new Alumnes("Pere", 15, Persona.SEXE.HOME, 1, 'A');
        a2 = new Alumnes("Julieta", 16, Persona.SEXE.DONA, 2, 'C');

        a1.print();
        a2.print();

        Professor p1, p2;
        p1 = new Professor("Manuel", 50, Persona.SEXE.HOME, 25, "Física");
        p2 = new Professor("Elena", 47, Persona.SEXE.DONA, 15, "Castellano");

        p1.print();
        p2.print();

        Jugador j1, j2;
        j1 = new Jugador("Messi", 38, Persona.SEXE.HOME, "Inter Miami", 30, "RW");
        j2 = new Jugador("Odegaard", 26, Persona.SEXE.HOME, "Arsenal", 12, "CAM");

        j1.print();
        j2.print();
    }
}
