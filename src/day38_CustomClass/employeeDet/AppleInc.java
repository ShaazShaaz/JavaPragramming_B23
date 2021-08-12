package day38_CustomClass.employeeDet;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setInfo("Shazia",'F',11,"SDET",115000.0);

        Employee employee2=new Employee();
        employee2.setInfo("Abbas",'M',12,"SDET",110000.0);

        System.out.println(employee1);
        System.out.println(employee2);

        Employee employee3=new Employee();
        employee3.setInfo("Ahmet",'M',13,"QA",110000.0);

        Employee employee4=new Employee();
        employee4.setInfo("John",'M',14,"SDET",100000.0);

        Employee employee5=new Employee();
        employee5.setInfo("Alex",'F',15,"SDET",115000.0);

        Employee[] arr={employee1,employee2,employee3,employee4,employee5};
        ArrayList<Employee> employees=new ArrayList<>();
        employees.addAll(Arrays.asList(arr));
        double budget=0;
        for (Employee each:employees){
          //  System.out.println(each.name+": "+ each.salary);
           // System.out.println(each);
            budget+=each.salary;
        }
        System.out.println(budget);

        System.out.println("-----------------------------");
        ArrayList<Employee> list1=new ArrayList<>();
        list1.removeIf(p-> p.salary>=130000.0);

        for (Employee each : list1) {
            System.out.println(each);
        }
        System.out.println("---------------------");
        // remove all employees that r not SDET
        /*
        ArrayList<Employee> list2=new ArrayList<>();
        for (Employee each : employees) {
            if (each.jobTitle.equalsIgnoreCase("SDET")){
                list2.add(each);
            }
        }
        System.out.println(list2.size());;
         */
        ArrayList<Employee> list2=new ArrayList<>(employees);
        list2.removeIf(p-> !p.jobTitle.equalsIgnoreCase("SDET"));
        System.out.println(employees);

    }
}
