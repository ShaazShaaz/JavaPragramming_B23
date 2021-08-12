package CustomMethods;

public class MergeStrings {
    /*
    Write a method mergeStrings that will return the strings merged, one letter at a time,
     starting with one. Please note one and two can be of different lengths.
Examples:
s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
     */
    public static void main(String[] args) {
      String  s1 = "12345";
     // String[] one=s1.split("");
       String s2 = "abcdefgh";
     //  String[] two=s2.split("");
        String result="";
        if (s1.length()>s2.length()){
            for (int i = 0,j=0; i <s2.length() ;j++, i++) {
                result+=""+s1.charAt(i)+s2.charAt(j);
            }
            result=result+s1.substring(s2.length());
        }else if (s2.length()>s1.length()){
            for (int i = 0,j=0; i <s1.length() ;j++, i++) {
                result+=""+s1.charAt(i)+s2.charAt(j);
            }
            result=result+s2.substring(s1.length());
        }

        System.out.println(result);
       // System.out.println(mergeStrings(s1,s2));
    }


    public static String mergeStrings(String one, String two){
        String result="";
        for (int i = 0; i < one.length(); i++) {
            result += "" + one.charAt(i) ;
        }
        for (int j = 0; j < two.length(); j++) {
            result+=""+two.charAt(j);
        }
        return result;
    }
}
