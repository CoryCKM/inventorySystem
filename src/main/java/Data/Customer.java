package Data;

import java.util.Date;
import java.util.List;

/**
 * this class will store customer information in the system
 */
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dob;
    private List<Address> addressList;

    //TODO: will store shoping cart information with a customer


    public Customer() {
    }

    public Customer(String firstName, String lastName, Date dob, List<Address> addressList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.addressList = addressList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", addressList=" + addressList +
                '}';
    }
}
