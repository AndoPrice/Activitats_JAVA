package POO.Properties;

public class House extends Prop{

    private int numRooms;
    private boolean swimmingpool;

    public House(String propID, String address, String city, float price, int numRooms, boolean swimmingpool) {
        super(propID, address, city, price);
        this.numRooms = numRooms;
        this.swimmingpool = swimmingpool;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public boolean isSwimmingpool() {
        return swimmingpool;
    }

    public void setSwimmingpool(boolean swimmingpool) {
        this.swimmingpool = swimmingpool;
    }
}
