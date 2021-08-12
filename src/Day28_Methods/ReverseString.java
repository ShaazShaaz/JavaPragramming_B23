package Day28_Methods;

import Day19.StringReverse;

public class ReverseString {
    /*
    create a method that can reverse any String
     */
    public static void main(String[] args) {
        reverse("Shazia");
    }
    public static void reverse(String name){
        String reversed="";
        for (int i=name.length()-1;i>=0;i--){
            reversed+=name.charAt(i);
        }
        System.out.println(reversed);
    }

}
