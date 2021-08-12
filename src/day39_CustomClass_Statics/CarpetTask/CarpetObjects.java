package day39_CustomClass_Statics.CarpetTask;

public class CarpetObjects {
    public static void main(String[] args) {
        /*
        create a class called carpetObjects, and create an array of the carpet that contains 5
        carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and
        store all regular carpets into the list of regularCarpets

                    use for each loop to print out all the persian carpets
         */
        Carpet[] carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
        carpets[0].customOrder(5,2,10,false);
        System.out.println(carpets[0]);
    }
}
