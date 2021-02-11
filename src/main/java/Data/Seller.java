package Data;

/**
 * this class will store a seller's information inside of an object that
 * can be retrieved and passed around the system
 */
public class Seller {

    private Long id;
    private String companyName;
    private String sellerName;
    private Address address;

    public Seller(String companyName, String sellerName, Address address) {
        this.companyName = companyName;
        this.sellerName = sellerName;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
