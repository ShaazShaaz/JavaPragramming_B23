package Day05_ArithmeticOperators;

public class Address {
    public static void main(String[] args) {
        /*
        1. create a class named Day05.Address and declare the following variables:
        name, buildingNumber, streetName, city, state, zipCode

        use string concatenation to display the full address of the person

        Ex:
            Daniel Owens
            7925 Jones Branch Dr
            McLean VA 22102

            can also do:
            String name = "Shazia Senol",
                   buildingNumber = "622",
                   streetName = "Kelso Rd",
                   city = "Pittsburgh",
                   state = "PA",
                   zipCode = "15243";

         */
        String name = "Shazia Senol";
        int buildingNumber = 622;
        String streetName = "Kelso Rd";
        String city = "Pittsburgh";
        String state = "PA";
        int zipCode = 15243;

        System.out.println( name + "\n" + buildingNumber +" " +
        streetName + "\n" + city + " " + state + " " + zipCode);



    }
}
