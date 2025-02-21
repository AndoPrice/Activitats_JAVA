package FuncionsRecursius;

public class Entrepa {
    public static void main(String[] args) {
        String bocata ="Bocatayorkqueso";
        menjar(bocata);

    }
    public static String mossegar (String s){
        int mida = 1+(int)(Math.random()*4);
        return s.substring(0,mida);
    }
    public static boolean tragable (String s){
        return s.length()<=4;
    }
    public static void tragar (String s){
        System.out.println(s);
        System.out.println("Ñam!");
    }
    public static String llevar (String b, String t){
        return b.replaceFirst(t, "");
    }
    public static void menjar (String b){
        if(tragable(b)){
            tragar(b);
        }
        else{
            String boci = mossegar(b);
            String restant = llevar(b, boci);
            menjar(boci);
            menjar(restant);
        }
    }
}
