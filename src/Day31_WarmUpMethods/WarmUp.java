package Day31_WarmUpMethods;

import java.util.Arrays;

public class WarmUp {
    // create a method that can remove the duplicates from a string, returns string
    // removeDup("AAABBBBBCCCCCCCC")====>  "ABC"
    public static void main(String[] args) {
        String str="AAHHHHHHUREEE";
     //    System.out.println(removeDupl(str));
        String r=removeDupl(str);
        System.out.println(r);
        System.out.println("===========================");

        String str1="heart";
        String str2="earth";
        System.out.println(isAnagram(str1,str2));
        String word="fhddddjg";
        int n1=frequency(word,'d');
        System.out.println(n1);
        System.out.println("---------------------");

        // find the frequency of the characters and print like a3b4c6
        String s3="aaabbbbccccccddddd";
       String result=frequencyOfCharacters(s3);
        System.out.println(result);

    }

   // remove duplicates
    public static String removeDupl (String str){
        String result="";
       /* for (int i = 0; i <=str.length()-1; i++) {
            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }*/
        for (char ch:str.toCharArray()){  // can also use for each. should convert str to array
            if (result.indexOf(ch)<0){
                // if index of character in result is -1   can also use- !result.contains(""+ch)
                result+=ch;   //       then concat to result
            }
        }
       // System.out.println(result);


        return  result;
    }

    // isAnagram          "heart" & "earth"==> true
    public static boolean isAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();//{'h','e','a','r','t'}
        char[] ch2=str2.toCharArray();//{'e','a','r','t','h'}
        Arrays.sort(ch1);  // aehrt
        Arrays.sort(ch2);   // aehrt

       return Arrays.equals(ch1,ch2);  // will return boolean
    }

    //Write a return method named frequency that accepts two parameters: String and Char.
    // then returns the frequency of the char from the string
    //            Ex:
    //                frequency("AAABB", 'A');  ==> 3
    public static int frequency(String str, char ch){
        int count=0;
       for (char each :str.toCharArray()){  // using for each by converting string into array
           if (each==ch){
               count++;
           }
       }

        return count;
    }

    public  static String unique(String str){

        String s="aaaabbbchhhj";
        String unique="";
        // first find the frequency of each of the characters
        for (int i = 0; i < s.length(); i++) {
            char each=s.charAt(i);
            int frequency=frequency(s,each);
            // now check the count, if 1, then unique
            if (frequency==1){
                unique+=each+" ";
            }
        }
        return  unique;
    }

    public static String frequencyOfCharacters(String str){
        // find the frequency of the characters and print like a3b4c6
      //  String s3="aaabbbbcccccc";
        String result="";
        for (char each: removeDupl(str).toCharArray()){
            int frequency=frequency(str,each);
            result+=each;
            result+=frequency;
        }
        return result;
    }






}
