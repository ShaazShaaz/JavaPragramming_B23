package CustomMethods;

public class CoverString {
    /*
    The coverString method will take 2 string parameters from the caller.
Your job is to write an important code that will :
to search and find each appearance of coverME within main
then surround it with square brackets [coverMe]
if you cannot find the coverME within main then just return whole main itself covered [main].
keep in mind that coverME value can be of any length.
Examples:
coverString("java methods", "me") ) ; ==> "java [me]thods"
     */
    public static void main(String[] args) {
        String str="java methods";
        String s="me";
        System.out.println(coverString(str, s));
    }

    public static String coverString(String main, String coverME){
        String result="";
        if (!main.contains(coverME)){
            result="["+ main+"]";
        }
        else {
            result=main.replaceAll(coverME,"["+coverME+"]");
        }
        return result;
    }
}
