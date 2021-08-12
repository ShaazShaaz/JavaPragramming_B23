package CustomMethods;

public class IsError {
    /*
    The isError method checks if the given String begins with error
The method will return true if the String starts with error otherwise it will return false
Example:
isError("foo bar")
returns : false
     */
    public static void main(String[] args) {
        System.out.println(isError("foo bar"));
    }

    public static boolean isError(String line){
        return (line.startsWith("error"))? true:false;
    }
}
