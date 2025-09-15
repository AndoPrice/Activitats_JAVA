package POO.Properties;

public class Boat extends Prop{

    private float length;
    private boolean navigable;

    public Boat(String propID, String address, String city, float price, boolean navigable, float length) {
        super(propID, address, city, price);
        this.navigable = navigable;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public boolean isNavigable() {
        return navigable;
    }

    public void setNavigable(boolean navigable) {
        this.navigable = navigable;
    }
}
