package CustomMethods;

public class LimitString {
    /*
    This method gets a string and an int, it returns a string.
The method will limit the given String by a certain amount of characters(given int)
Examples:
limit("abcd",2)
returns "ab"
     */
    public static void main(String[] args) {
        System.out.println(limit("abcd",2));
    }

    public static String limit(String text, int maxLength){

        return text.substring(0,maxLength);
    }


}
