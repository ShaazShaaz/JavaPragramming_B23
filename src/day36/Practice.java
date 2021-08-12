package day36;

import utilities.StringUtilities;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2!=0){
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println("------------------------");

        // removeIf method
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8));
       // System.out.println(list2);
         list2.removeIf(p-> p<5);
        list2.removeIf(p -> p%2!=0 );
        System.out.println(list2);
        System.out.println("---------------------------");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad","Merve","Feruza","Said","Komiljon","Selda","Fhilipp"));
        names.removeIf(p-> p.toLowerCase().contains("a"));
        System.out.println(names);
        System.out.println("-----------------------");

        ArrayList<String> words=new ArrayList<>();
        words.addAll(Arrays.asList("Racecar","Anna","Level","Said","Java","Cybertek","Pop","Kayak"));
       // words.removeIf(p-> StringUtilities.isPalindrome(p));
        System.out.println(words);
        for (String each:words){
            String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);
            }
            boolean isPalindrome=reverse.equalsIgnoreCase(each);
            words.removeIf(p-> isPalindrome);
        }
        System.out.println(words);
    }
}
