package day43_OOP_Encapsulation.itemsTask;

public class MyCart {
/*
    create a class called MyCart
            create 5 static variables of Items
            Add a static block to to set all the static variables
 */

   public static Item item1,item2,item3,item4,item5;

   static {
       item1=new Item("milk",3,2);
       item2=new Item("eggs",0.5,30);
       item3=new Item("diapers",48,1);
       item4=new Item("bread",4,5);
       item5=new Item("toilet papers",10,20);
   }













}
