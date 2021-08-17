package Day29CustomMethods;

public class ReturnMethods {
    public static void main(String[] args) {
        String str="racecar";
       String reverseStr =reverse(str);
       boolean isPalindrome=isPalindrome(str);
        System.out.println("is palindrome= "+isPalindrome);

    }


    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {  // gives the reversed version of string
            result+=str.charAt(i);
        }
        return result;

    }
    public static boolean isPalindrome(String str){
        String reversedStr= reverse(str);
/*
        if (reversedStr.equalsIgnoreCase(str)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println("not a palindrome");
        }*/

      return (reversedStr.equalsIgnoreCase(str)?true:false);

    }

}
