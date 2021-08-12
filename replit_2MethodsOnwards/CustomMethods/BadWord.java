package CustomMethods;

public class BadWord {
    /*
    This method accept two strings (text and badWord) and returns a string.
The method will take out all the occurrences of badWord in the text.
Example:
clean ("one two three","two")
returns "one three"
     */
    public static void main(String[] args) {
        System.out.println(clean("one two three two","one"));
    }

    public static String clean (String text , String badWord){
        if (text.contains(badWord)){
            return text=text.replaceAll(badWord+" ","");
        }else {
            return text;
        }
    }


}
