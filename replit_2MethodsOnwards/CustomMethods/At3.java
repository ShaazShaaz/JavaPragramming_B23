package CustomMethods;

public class At3 {
    /*
    at3 accepts two strings and returns a string.
The first string is the one that will be manipulated. At the 3rd char position of target
you will insert the word argument.
Example:
at3("longword","foo")
return: "lonfoogword"
     */
    public static void main(String[] args) {
        String s="longword";
        String word="foo";
        System.out.println(at3(s,word));
    }


    public static String at3(String target,String word){

       return (target.substring(0,3)+word+target.substring(3));

    }
}
