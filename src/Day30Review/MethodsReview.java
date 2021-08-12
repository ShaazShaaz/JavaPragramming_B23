package Day30Review;

import utilities.StringUtilities;

import java.util.StringTokenizer;

public class MethodsReview {
    public static void main(String[] args) {
        String str="Java";
       String result= StringUtilities.reverse(str);

        System.out.println(result);

        String word="Anna";
        System.out.println(StringUtilities.isPalindrome(word));
    }
}
