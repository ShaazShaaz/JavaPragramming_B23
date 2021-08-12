package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    /*
    The search method accepts ArrayList of Strings and String find. The method returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if an instance of find doesn't exist return:"search failed"
Example:
search(["one apple","two orange","four banana"],"four")
returns:
"four banana"
("four banana" contains "four" so method returns "four banana")
     */
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>(Arrays.asList("hello","world"));
        System.out.println(search(array,"four"));
    }

public static String search(ArrayList<String> r, String find){
    String result="";
    for (String each:r) {
        if (each.contains(find)) {
            result = each;
            break;
        } else {
            result = "search failed";
        }
    }
    return result;

}

}
