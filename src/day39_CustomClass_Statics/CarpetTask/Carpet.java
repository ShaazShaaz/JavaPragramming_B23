package day39_CustomClass_Statics.CarpetTask;

import java.text.DecimalFormat;

public class Carpet {
    /*
     Carpet Task:
    	create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitPrice, & is Persian
                        calcCost(): should be able to calculate the total cost of the carpet and
                        return it as double toString(): should be able to display all the info of
                        the carpet including the total cost of
                        the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
        create a class called carpetObjects, and create an array of the carpet that contains 5
        carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and
        store all regular carpets into the list of regularCarpets

                    use for each loop to print out all the persian carpets

     */
    public double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calCost(){
        double totalPrice=(width+length)*unitPrice;
        return (isPersian)?totalPrice+200:totalPrice;
    }

    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= "+df.format(calCost())+
                '}';
    }
}
