package Strings;

public class Paragraf {
    public static void main(String[] args) {
        String paragraf ="Hola que tal com va";

        int paraules = 0;
        while(paragraf.indexOf(' ')!=-1) {
            int posBlank = paragraf.indexOf(' ');
            String p1 = paragraf.substring(0, posBlank);
            paragraf = paragraf.substring(posBlank + 1);
            System.out.println(p1);
            paraules++;
        }
        System.out.println(paragraf);
        System.out.printf("Hi ha %d paraules", paraules+1);
    }
}
