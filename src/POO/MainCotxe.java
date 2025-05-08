package POO;

public class MainCotxe {

    public static void main(String[] args) {
        Cotxe c1, c2, c3;

        //cridades constructors
        c1 = new Cotxe("Ford", "6672AFD", 30f, 4);
        c2 = new Cotxe("Mercedes", "1239MFB", 30f, 4);
        c3 = new Cotxe("Citroen", "5743AMD");

        //setters

        c1.setMatricula("5439FUC");
        c2.setPortes(2);
        c2.setVelocitat(30);
        c3.setMarca("Ferrari");

        // Getters
        System.out.printf("El %s va a %fkm/h\n", c1.getMarca(),c2.getVelocitat());

        // Altres

        c2.accelerar(20);

        c1.print();
        c2.print();
        c3.print();


    }
}
