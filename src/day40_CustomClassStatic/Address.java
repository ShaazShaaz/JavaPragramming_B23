package day40_CustomClassStatic;

public class Address {
    /*
    Create a class named Address
    Attributes:
        instance: buildingNumber, street, city, state, zipCode;
        static: country (USA)
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
     */

    public String street,city,state,buildingNumber;
    public int zipCode;

    public static String country="USA";

    public void setInfo(String buildingNumber,String street,String city,String state,int zipCode){
        this.buildingNumber=buildingNumber;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }

    public String toString() {
        return buildingNumber+" "+street+"\n"+city+" "+state+", "+zipCode;
    }
}
