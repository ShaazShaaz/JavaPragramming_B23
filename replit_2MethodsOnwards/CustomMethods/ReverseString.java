package CustomMethods;

public class ReverseString {
    /*
    The reverse method will reverse the given String
Example:
reverse("foo") ==> "oof"
     */
    public static void main(String[] args) {
        System.out.println(reverse("foo"));
    }


    public static String reverse(String input){
        String result="";
        for (int i = input.length()-1; i >=0 ; i--) {
            result+=""+input.charAt(i);
        }
        return result;
    }
}
