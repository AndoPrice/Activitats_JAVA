package POO.Properties;

import static java.lang.Float.MAX_VALUE;

public class Main {

    public static Owner [] allOwners;
    public static int numOwners;
    public static int numProps;

    public static void main(String[] args) {

        allOwners = new Owner[5];
        numOwners = 0;
        numProps = 0;

        House h1 = new House("H1","Major 1", "Manacor", 3 );
        House h2 = new House("H2", "Principal 23", "Palma", 4);
        House h3 = new House("H3", "Gessamí 26", "S'Illot", 3);
        House h4 = new House("H4", "Llevant 24", "Artà", 2);
        House h5 = new House("H5", "Xaloc 6", "Campos", 5);

        h1.setSwimmingPool(true);
        h3.setSwimmingPool(true);

        h1.setPrice(3000);
        h2.setPrice(1500);
        h3.setPrice(2000);
        h4.setPrice(1300);
        h5.setPrice(4000);

        Boat b1 = new Boat("B1", "Moll 15", "Palma", 2.5f);
        Boat b2 = new Boat("B2", "Moll 13", "Palma", 4.0f);
        Boat b3 = new Boat("B3", "Moll 5", "Porto Cristo", 3.0f);
        Boat b4 = new Boat("B4", "Moll 8", "Cala Bona", 2.3f);
        Boat b5 = new Boat("B5", "Moll 20", "Pollença", 6.0f);

        b1.setPrice(300);
        b2.setPrice(2000);
        b3.setPrice(1000);
        b4.setPrice(900);
        b5.setPrice(3000);

        Owner p1 = new Owner("Paco", "Major 1, Manacor" );
        Owner p2 = new Owner("Bel", "Principal 23, Palma");
        Owner p3 = new Owner("Tomeu", "Gessamí 26, S'Illot");

        addOwner(p1);
        addOwner(p2);
        addOwner(p3);

        addProp("Paco", h1);
        addProp("Paco", b2);
        addProp("Bel", b1);
        addProp("Bel", h2);
        addProp("Tomeu", h3);
        addProp("Tomeu", b3);
        addProp("Tomeu", h4);
        addProp("Tomeu", b4);

        int numPalma = numPropsInCity(allOwners, "Palma");

        System.out.printf("%d props in %s. \n", numPalma, "Palma");

        String name = ownerCheapestProp(allOwners);
        System.out.printf("Owner cheapest prop: %s. \n", name);

        float extended = extendedPrices (allOwners);
        System.out.printf("Extended prices: %f. \n", extended);

        int numBoats = numBoatsMinLength(3.0f, allOwners);
        System.out.printf("%d Boats larger than %f. \n", numBoats, 3.0f);

        int numPools = numHousesWithPool (allOwners);
        System.out.printf("%d Pools. \n", numPools);






    }

    public static void addOwner (Owner o){
        if(numOwners<allOwners.length){
            allOwners[numOwners]=o;
            numOwners++;
        }
    }

    public static void addProp (String ownerName, Prop p){
        for(int i = 0; i<numOwners; i++){
            if(allOwners[i].getName().equals(ownerName)){
                allOwners[i].addProp(p);
                numProps++;
            }
        }

    }

    public static int numPropsInCity (Owner[] owners, String city){
        int n = 0;
        for(int i = 0; i<owners.length; i++){
            Owner owner = owners[i];
            if(owner != null){
                for(int j = 0; j<owner.getNumProps(); j++){
                    Prop p = owner.getProps()[j];
                    if(p.getCity().equals(city)){
                        n++;
                    }
                }
            }
        }
        return n;
    }

    public static String ownerCheapestProp (Owner[] o){
        float cheapestPrice = MAX_VALUE;
        String name = "";
        for(int i = 0; i<o.length; i++){
            Owner owner = o[i];
            if(owner != null){
                if(owner.cheapestPrice()<cheapestPrice){
                    cheapestPrice = owner.cheapestPrice();
                    name = owner.getName();
                }
            }

        }
        return name;
    }

    public static float extendedPrices (Owner[] owners){
        float cheapestPrice = MAX_VALUE;
        for(int i = 0; i<owners.length; i++){
            Owner owner = owners[i];
            if (owner != null){
                if(owner.cheapestPrice()<cheapestPrice){
                    cheapestPrice = owner.cheapestPrice();
                }
            }
        }
        float expensivePrice = 0;
        for(int i = 0; i<owners.length; i++){
            Owner owner = owners[i];
            if (owner != null) {
                if (owner.expensivePrice() > expensivePrice) {
                    expensivePrice = owner.expensivePrice();
                }
            }
        }
        return expensivePrice-cheapestPrice;
    }

    public static int numBoatsMinLength(float l, Owner[] owners){
        int n = 0;
        for(int i=0; i<owners.length; i++){
            Owner owner = owners[i];
            if(owner != null) {
                for (int j = 0; j < owner.getNumProps(); j++) {
                    Prop p = owner.getProps()[j];
                    if(p instanceof Boat) {
                        if (((Boat) p).getLength()>= l) {
                            n++;
                        }
                    }
                }
            }
        }
        return n;
    }


    public static int numHousesWithPool(Owner[] owners){
        int n = 0;
        for(int i=0; i<owners.length; i++){
            Owner owner = owners[i];
            if(owner != null) {
                for (int j = 0; j < owner.getNumProps(); j++) {
                    Prop p = owner.getProps()[j];
                    if(p instanceof House) {
                        if (((House) p).isSwimmingPool()) {
                            n++;
                        }
                    }
                }
            }
        }
        return n;
    }
}
