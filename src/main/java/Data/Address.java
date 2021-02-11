package Data;

/**
 * this class will store an address in the system and make passing around an address easy
 */
public class Address {

    private String streetNbr;
    private String streetName;
    private String zip;
    private String state;
    private String city;

    public Address() {
    }

    public Address(String streetNbr, String streetName, String zip, String state, String city) {
        this.streetNbr = streetNbr;
        this.streetName = streetName;
        this.zip = zip;
        this.state = state;
        this.city = city;
    }

    public String getStreetNbr() {
        return streetNbr;
    }

    public void setStreetNbr(String streetNbr) {
        this.streetNbr = streetNbr;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
