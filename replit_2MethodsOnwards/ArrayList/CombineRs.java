package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineRs {
    /*
    Finish the combineRs method to combine the two given String arrays into one arraylist
     and return the arraylist.
for example:
combineRs(["f","o","o"],[" b","a","r"])
returns [f, o, o, b, a, r]
     */
    public static void main(String[] args) {
        String[] array1={"Shaz","Anjum","Nikhat"};
        String[] array2={"Tabbu","Tannu"};
        System.out.println(combineRs(array1,array2));
    }




    public static ArrayList<String> combineRs(String[] r1,String[] r2){
        ArrayList <String> combined=new ArrayList<>();
        combined.addAll(Arrays.asList(r1));
       combined.addAll(Arrays.asList(r2));
       return combined;
    }
}
