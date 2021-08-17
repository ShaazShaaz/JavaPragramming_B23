package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.add("eggs");
        groceryList.add("milk");
        groceryList.add("water");
        groceryList.add("vinegar");
        groceryList.add("bread");
        System.out.println(groceryList);

        // to replace eggs with masks  set()
        groceryList.set(0,"masks");
        groceryList.set(3,"toilet paper");
        System.out.println(groceryList.get(1));
        System.out.println(groceryList);
        System.out.println("------------------------");

        // to remove an element by index: remove(index)
        groceryList.remove(1);
        System.out.println(groceryList);

        // to remove an element by passing the object: remove(object)
       boolean r1= groceryList.remove("water");

        System.out.println(groceryList);
        System.out.println(r1);
        System.out.println("--------------------------");

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
          // to remove an integer object, we need to convert integer to object
        list.remove(Integer.valueOf(30));
        //also option casting
       // int a=1;
       // list.remove(a);

        System.out.println(list);

       // groceryList.clear();
        list.clear();
        System.out.println(groceryList);
        System.out.println(list);
        System.out.println("-----------------------");

        //INDEXOF AND LASTINDEXOF
        ArrayList<Character> list1=new ArrayList<>();
        list1.add('a');
        list1.add('a');
        list1.add('a');
        list1.add('b');
        list1.add('a');
        list1.add('d');
        list1.add('c');

        System.out.println(list1);

        list1.indexOf('b');//3
        list1.lastIndexOf('b');//3

        ArrayList<Character> unique=new ArrayList<>();
        for (Character each : list1) {
            if (list1.indexOf(each)==list1.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique);
        System.out.println("----------------------------------");

        // contains() method
        boolean hasToiletPaper=groceryList.contains("toilet paper");
        boolean has2=list.contains(10);
        boolean hasToiletPaper2=groceryList.indexOf("toilet paper")>=0;
        System.out.println(hasToiletPaper);
        System.out.println(hasToiletPaper2);
        System.out.println(has2);
        System.out.println("----------------------------");

        //remove duplicates
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);
        ArrayList<Character> result=new ArrayList<>(); // ABC
       /* for (int i = 0; i < characters.size(); i++) {
            if (!result.contains(characters.get(i))){
                result.add(characters.get(i)) ;
            }
        }

        */
        for (Character each:characters){
            if (!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);
        System.out.println("----------------------");

        //reverse arraylist
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        ArrayList<Integer> result2=new ArrayList<>();
        for (int i = nums.size()-1; i >=0 ; i--) {
            result2.add(nums.get(i));
        }
        System.out.println(result2);
        System.out.println("-------------------------");

        // equals()
        ArrayList<Integer> n1=new ArrayList<>();
        n1.add(10);
        n1.add(20);
        ArrayList<Integer> n2=new ArrayList<>();
        n2.add(10);
        n2.add(20);
        System.out.println(n1==n2); // false cuz they have diff objects
        System.out.println(n1.equals(n2));
        System.out.println(n1.isEmpty());// returns boolean



    }
}
