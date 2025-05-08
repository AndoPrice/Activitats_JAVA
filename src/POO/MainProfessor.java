package POO;

public class MainProfessor {
    public static void main(String[] args) {
        // Declaració
        Professor p1, p2, p3;

        // Cridades als constructors
        p1 = new Professor("Manel", 35, Professor.DEPARTAMENT.FISICA);
        p2 = new Professor("Xesca", 22, Professor.DEPARTAMENT.CATALA);
        p3 = new Professor("Biel", Professor.DEPARTAMENT.MATES);

        // Setters (mutadores)
        p1.setNom("Manel Ernest");
        p2.setDepartament(Professor.DEPARTAMENT.ANGLES);
        p3.setAnys(15);

        // Getters
        int sumaAnys = p1.getAnys() + p2.getAnys() + p3.getAnys();
        System.out.printf("SUMA ANYS: %d.\n", sumaAnys);

        //Altres
        p1.print();
        p2.print();
        p3.print();

    }
}
