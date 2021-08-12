package day40_CustomClassStatic;

import Day13.ScannerConvert;

import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        Address add=new Address();
        Scanner scan=new Scanner(System.in);
       // System.out.println(Address.country);
        System.out.println("enter your building number:");
        String building= scan.next();
        scan.nextLine();

        System.out.println("enter your street name:");
        String street= scan.nextLine();

        System.out.println("enter your city:");
        String city= scan.nextLine();

        System.out.println("enter your state:");
        String state= scan.nextLine();

        System.out.println("enter your zipcode:");
        int zipCode= scan.nextInt();

        add.setInfo(building,street,city,state,zipCode);
        System.out.println(add+" "+Address.country);







    }
}
