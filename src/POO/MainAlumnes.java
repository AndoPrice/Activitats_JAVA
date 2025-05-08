package POO;

public class MainAlumnes {
    public static void main(String[] args) {
        alumnes a1, a2, a3; // Declaració

        a1 = new alumnes("Paco",1,'A');
        a2 = new alumnes("Bel",3,'f');
        a3 = new alumnes("Jaume");

        // Setters
        a1.setGrup('F');
        a2.setCurs(4);
        a3.setNom("James");
        a3.setCursGrup(2, 'B');

        // Getters
        System.out.printf("%s va a %d.\n", a2.getNom(), a2.getCurs());

        // Altres
        a1.print();
        a2.print();
        a3.print();
    }
}
