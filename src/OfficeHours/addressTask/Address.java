package OfficeHours.addressTask;

public class Address {
    /*
   Task 1: AddressTask

   Create a class named Address

           Private variables:
                   street, city, state, zipCode,country

           encapsulate all the fields

           add a constructor that can set all the instances
                 overload constr with no arg constr

           - if the street name isEmpty or street length is bigger than 50
            otherwise
                ERROR : Invalid Street

           - ZipCode length should be equal 5 otherwise
                ERROR :Invalid ZipCode

           DO NOT duplicate any code fragments

    */
    private String street,city,state,zipCode;
    private final static String country="USA";
    public Address(){

    }

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.length()>15){
            System.out.println("error");
            return;
        }
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length()!=5){
            System.out.println("invalid zipcode");

        }else {
            this.zipCode = zipCode;
        }
    }

    public static String getCountry() {
        return country;
    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
