import java.util.Scanner;

public class MarketPriceGenerator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        System.out.println("Enter your property type:");
        houseType= scan.nextLine();
        if (houseType=="Condo"){
            propertyPrice=50000;
        }else if (houseType=="Townhouse"){
            propertyPrice=75000;
        }else if (houseType=="Single Family Home"){
            propertyPrice=95000;
        }
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms= scan.nextInt();
        int bedroomPrice=30000*numberOfBedrooms;
        propertyPrice+=bedroomPrice;
        System.out.println("Do you have a backyard?");
        backyard= scan.nextBoolean();
        if (backyard){
            propertyPrice+=5000;
            System.out.println("Backyard is not available for condo!");
        }
        System.out.println("Do you have garage?");
        garage= scan.nextBoolean();
        if (garage){
            System.out.println("How many spots?");
        }
        garageSpots= scan.nextInt();
        if (garageSpots>10){
            System.out.println("Pardon,its not public parking!");
        }
        int garagePrice=garageSpots*20000;
        propertyPrice+=garagePrice;
        System.out.println("How close is metro station?");
        metroAccessibility= scan.nextFloat();
        if (metroAccessibility <= 1) {
            propertyPrice+=10000;
        }else  if (metroAccessibility>1 &&metroAccessibility<=3){
            propertyPrice+=5000;
        }
        System.out.println("How close is highway?");
        highwayAccessibility=scan.nextFloat();
        if (highwayAccessibility<=1){
            propertyPrice+=15000;
        }else  if (highwayAccessibility>1 && highwayAccessibility<=5){
            propertyPrice+=8000;
        }else if (highwayAccessibility>5 && highwayAccessibility<=20){
            propertyPrice+=4000;
        }
        System.out.println("What's the rating of nearest school?");
        schoolScore=scan.nextFloat();
        if (schoolScore>=4 && schoolScore<=10) {
            if (schoolScore <= 10 && schoolScore >= 8) {
                propertyPrice += 45000;
            } else  {
                propertyPrice += 20000;
            }
        }else {
            propertyPrice+=5000;
        }
        System.out.println("Does any of your family members smoke?");
        smoking= scan.nextBoolean();
        if (smoking){
            propertyPrice-=5000;
        }
        System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");


    }
}
