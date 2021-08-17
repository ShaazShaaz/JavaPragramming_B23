package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,3,35,27,58,180));
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("list = " + list);
        Collections.swap(list,0,2);
        System.out.println("list = " + list);
        Collections.replaceAll(list,10,20);
        System.out.println("list = " + list);
        //Collections.frequency(list,20);
        System.out.println(Collections.frequency(list,20));
        System.out.println("----------------------------");

        ArrayList<Character> chars=new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','C','A','C'));
        /*
        ArrayList<Character> unique=new ArrayList<>();

        for (Character each:chars){
            if (Collections.frequency(chars,each)==1){
                unique.add(each);
            }
        }*/
        ArrayList<Character> unique=new ArrayList<>(chars);
        unique.removeIf(p -> Collections.frequency(unique,p)!=1);
        System.out.println(unique);
        System.out.println("----------------------");

        String str="ABABABCDEEEE";
        String unique2="";
        // to convert a normal string to array, use split,
        // then to convert that array to collection type, use Arrays.asList and pass it in argument.
        // and finally initiate an arraylist with it
        ArrayList<String> result=new ArrayList<>(Arrays.asList(str.split("")));
        /*for (String each:result){
            if (Collections.frequency(result,each)==1){
                unique2+=each;
            }
        }
        */
         result.removeIf(p-> Collections.frequency(result,p)!=1);
        System.out.println(unique2);
        System.out.println(result);
        System.out.println("+++++++++++++++++++");

        int max=Collections.max(list);
        int min=Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(10,10,10,9,9,8,7,6,40,58,20));
        int firstMax=Collections.max(list2);
        System.out.println("firstMax = " + firstMax);
        list2.removeIf(p-> p==firstMax);// can also pass it as Collections.max(list2)
        int secMax=Collections.max(list2);
        System.out.println("secMax = " + secMax);
        list2.removeIf(p-> p==Collections.max(list2));
        int thirdMax=Collections.max(list2);



        System.out.println("thirdMax = " + thirdMax);

        
        
        
    }
}
