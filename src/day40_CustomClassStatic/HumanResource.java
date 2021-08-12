package day40_CustomClassStatic;

import day38_CustomClass.employeeDet.Employee;

public class HumanResource {
    public static Employee employee1=new Employee();
    public static Employee employee2=new Employee();
    public static Employee employee3=new Employee();
    public static Employee employee4=new Employee();
    public static Employee employee5=new Employee();
    static { // use static block only when there r more than 1 steps to initialize
        employee1.setInfo("Ahmet",'M',1,"SDET",100000);
    }

    /*public static void main(String[] args) {
        employee1.setInfo("Ahmet",'M',1,"SDET",100000);
    }

     */

}
