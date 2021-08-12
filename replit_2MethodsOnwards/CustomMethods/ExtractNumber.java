package CustomMethods;

public class ExtractNumber {
    /*
    Create a method extractNum that cleans any non number string from a string it gets and
    returns the clean string
input:
s (string) - given String
return: string: a String of numbers only
Example:
extractNum("aa2aa3") ==> 23
     */
    public static void main(String[] args) {
        String str="aa2aa3";
        System.out.println(extractNum(str));
    }


    public static String extractNum(String s){
        String str="";
        s.split("");
        for (char each:s.toCharArray()){
            if (each>='0' && each<='9'){
                str+=each;
            }

        }
        return str;
    }
}
