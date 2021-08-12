package OfficeHours;

import java.util.ArrayList;

public class Category {

    public String name;
    public ArrayList<Product> products;
    public static String companyName;
    public static int totalEarning;

    public Category(String name) {
        this(name,new ArrayList<>());
      //  this.name = name;
      //  products=new ArrayList<>();
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void addProduct(){

    }


    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
