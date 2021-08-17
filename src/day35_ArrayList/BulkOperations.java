package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
      //  list.addAll(1,1,2,3,4,5,6); error

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(numbers);
        list.addAll(Arrays.asList(10,20,30,40));
        System.out.println(list);
        System.out.println("----------------------------");

        ArrayList<String> students=new ArrayList<>();
        students.addAll(Arrays.asList("Shazia","Yuliia","Alex","Victoria"));
        System.out.println(students);
        //remove a bulk  removeAll()
        students.removeAll(Arrays.asList("Yuliia","Alex"));
        System.out.println(students);
        ArrayList<String> students2=new ArrayList<>();
        System.out.println("--------------------------------");
        students2.addAll(students); // just checking lol
        System.out.println(students2);
        System.out.println("----------------------------");

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,2,3,3,4,4,4,5,5,6,6,6,7,7,1,1,2));
        System.out.println(nums);

        nums.removeAll(Arrays.asList(1));
        System.out.println(nums);

        // retain all. if u want to keep a bulk of matching elements, and it removes all the rest
        nums.retainAll(Arrays.asList(2,3));
        System.out.println(nums);
        System.out.println("-------------------");
        ArrayList<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Shazia","Yuliia","Victoria","Faluk","Alex"));
        employees.retainAll(Arrays.asList("Shazia","Faluk","Yuliia"));
        System.out.println(employees);
        System.out.println("==================================");

        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList("soda","milk","eggs","bread","water","apple","cherry"));
        // check if soda, wine and apple are there in the list
        boolean r1=groceryList.containsAll(Arrays.asList("soda","wine","apple"));
        System.out.println(r1);




    }
}
