package CustomMethods;

public class WaterTax {
    /*
    The waterTax method calculates a water bill. The method takes a double and returns a double.
The more water you use the more it will cost you
Cost under 50:
bill = units * 0.60;
Cost above 50:
bill = units * 0.90;
Cost above 100 the calculation is same as above 50 but an additional 50 fine
Cost above 150 its the same as above 50 but an additional 100 fine
Examples:
waterTax(50)
returns 30
     */
    public static void main(String[] args) {
        System.out.println(waterTax(150));
    }

    public static double waterTax(double units){
        double bill=0;
        if (units<50){
            bill=units*0.60;
        }
        if (units>=50 && units<=100){
            bill=units*0.90;
        }
        if (units>100 && units<=150){
            bill=(units*0.90)+50;
        }
        if (units>150 ){
            bill=(units*0.90)+100;
        }
        return bill;
    }
}
