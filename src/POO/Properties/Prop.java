package POO.Properties;

public class Prop {
    private String propID;
    private String address;
    private String city;
    private float price;

    public Prop (String propID, String address, String city, float price){
        this.propID = propID;
        this.address = address;
        this.city = city;
        this.price = price;
    }

    public void setPropID(String propID){
        this.propID = propID;
    }

    public String getPropID(){
        return propID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCheaperThan (Prop p){
        return
    }
}
