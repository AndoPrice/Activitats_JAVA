package Strings;

public class ADN {
    public static void main(String[] args) {
        String n = "";
        System.out.printf("ADN: %s \n", adn(n));
        System.out.printf("Microsatellite: %s", microsatellite(adn(n)));
    }

    public static String adn (String s){
        String l ="";
        String adn="";
        double n = 0;
        for(int i=0; i<100; i++){
            n = Math.random()*10;
            if(n<=2.5){
                l = "A";
            }
            if(n>2.5&&n<=5){
                l = "C";
            }
            if(n>5&&n<=7.5){
                l = "G";
            }
            if(n>7.5&&n<=10){
                l = "T";
            }
            adn = adn + l;
        }
        return adn;

    }
    public static boolean microsatellite (String s){
        String satelit = "TAT";
        return s.indexOf(satelit)!=-1;
    }

    public static int vegadesSatelit(String adn) {
        int times = 0;
        String satelit = "TAT";
        while (adn.indexOf(satelit) != -1) {
            int pos = adn.indexOf(satelit);
            times++;
            adn = adn.substring(pos + 1);
        }
        return times;
    }
}
