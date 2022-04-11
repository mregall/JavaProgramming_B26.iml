package day43_custom_classes;

public class Address {
    String street;
    String city;
    String state;
    int zipCode;

    // Constructor with a parameter
    public Address(String street, String city, String state, int zipCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
