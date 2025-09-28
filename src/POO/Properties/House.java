package POO.Properties;

public class House extends Prop{

    private int numRooms;
    private boolean swimmingpool;

    public House(String propID, String address, String city, int numRooms) {
        super(propID, address, city);
        this.numRooms = numRooms;
        this.swimmingpool = false;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public boolean isSwimmingPool() {
        return swimmingpool;
    }

    public void setSwimmingPool(boolean swimmingpool) {
        this.swimmingpool = swimmingpool;
    }
}
