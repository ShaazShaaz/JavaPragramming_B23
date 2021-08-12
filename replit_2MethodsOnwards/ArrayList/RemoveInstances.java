package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInstances {
    /*
    This method gets an Arraylist of Integers and a number(Integer). It returns an Arraylist.
It removes any instance of the given number from the Arraylist.
Example:
removeInst([1,1,2,3,1,4],1)
returns: [2,3,4]
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,1,1,2,3,1,4));
        System.out.println(removeInst(arr,1));
    }


    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n){
        ArrayList<Integer> result=new ArrayList<>();
        r.removeIf(p->p==n);
        result.addAll(r);
return result;
    }


}
