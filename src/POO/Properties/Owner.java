package POO.Properties;

import static java.lang.Float.MAX_VALUE;

public class Owner {
    private String name;
    private String address;
    private Prop[] props = new Prop[5];
    private int numProps;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
        this.props = new Prop[5];
        this.numProps = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Prop[] getProps() {
        return props;
    }

    public void setProps(Prop[] props) {
        this.props = props;
    }

    public int getNumProps() {
        return numProps;
    }

    public void setNumProps(int numProps) {
        this.numProps = numProps;
    }

    public void addProp (Prop p){
        if(numProps<props.length) {
            props[numProps] = p;
            numProps++;
        }
    }

    public float cheapestPrice(){
        float cheapestPrice = MAX_VALUE;
        for(int i = 0; i<numProps; i++){
            if(props[i].getPrice()<cheapestPrice){
                cheapestPrice = props[i].getPrice();
            }
        }
        return cheapestPrice;
    }

    public float expensivePrice(){
        float expensivePrice = 0;
        for(int i = 0; i<numProps; i++){
            if(props[i].getPrice()>expensivePrice){
                expensivePrice = props[i].getPrice();
            }
        }
        return expensivePrice;
    }

    public float averagePrices(){
        float averagePrices = 0;
        for(int i = 0; i<numProps; i++){
            averagePrices += props[i].getPrice();
        }
        return averagePrices/numProps;
    }

    public String cheapestProp(){
        float cheapestPrice = MAX_VALUE;
        for(int i = 0; i<numProps; i++){
            if(props[i].getPrice()<cheapestPrice){
                cheapestPrice = props[i].getPrice();
                int cheapestNum = numProps;
            }
        }
        return props[numProps].getPropID();
    }

    /*public void sort (int[]x){
        boolean ordenat = false;
        while(!ordenat){
            ordenat = true;
            for(int i=0;i<x.length; i++){
                if(x[i]<x[i+1]){
                    int temp = x[i];
                    x[i] = x[i+1];
                    x[i+1]= temp;
                    ordenat = false;
                }
            }
        }
    }*/

    public void sortPropsByPrice(){
        boolean ordenat = false;
        while(!ordenat){
            ordenat = true;
            for(int i=0;i<numProps-1; i++){
                if(props[i].getPrice()<props[i+1].getPrice()){
                    Prop temp = props[i];
                    props[i] = props[i+1];
                    props[i+1]= temp;
                    ordenat = false;
                }
            }
        }
    }

}
