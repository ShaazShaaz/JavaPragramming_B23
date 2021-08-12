package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAll {
    /*
    Create a static method that:
is called repeatAll
returns ArrayList of Booleans
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.
For example, if the parameter is
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
     */
    public static void main(String[] args) {
        ArrayList<Boolean> b1=new ArrayList<>(Arrays.asList(true, false, false));
        System.out.println(repeatAll(b1));
    }


    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> array){
        ArrayList<Boolean> b1=new ArrayList<>();
        b1.addAll(array);
        b1.addAll(array);
        return b1;

    }


}
