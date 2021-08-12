package CustomMethods;

public class RemoveDuplicates {
    /*
    uniqueChars is a method that will accept any String and return the String with out any dupclicate
     characters
Examples:
uniqueChars("java") ==> "jav"
uniqueChars("java") ==> "jav"
     */
    public static void main(String[] args) {
        System.out.println(uniqueChars("java"));
    }

    public static String uniqueChars(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }


}
