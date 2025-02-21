package basiques;

public class If {
    public static void main(String[] args) {

            int velocitat = 80;
            if(velocitat<=40){
                System.out.println("Velocitat massa baixa");
            }
            else if (velocitat <= 90) {
                System.out.println("velocitat adequada.");
            } else {
                System.out.println("Velocitat excessiva");
            }
    }
}