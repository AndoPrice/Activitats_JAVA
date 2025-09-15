package POO.Properties;

public class Owner {
    private String name;
    private String address;
    private Prop[] props = new Prop[5];
    private int numProps;

    public Owner(String name, String address, Prop[] props, int numProps) {
        this.name = name;
        this.address = address;
        this.props = props;
        this.numProps = numProps;
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

    public
}
