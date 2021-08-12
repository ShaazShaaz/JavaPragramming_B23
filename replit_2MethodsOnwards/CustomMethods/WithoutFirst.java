package CustomMethods;

public class WithoutFirst {
    /*
    The method accepts a string and returns a string without the first character
Example:
removeFirst("aaa")
returns "aa"
     */
    public static void main(String[] args) {
        System.out.println(removeFirst("aaa"));
    }


   public static String removeFirst(String target){
       return target.substring(1);
   }


}
