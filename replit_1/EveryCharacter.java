public class EveryCharacter {
    public static void main(String[] args) {
        /*
        Given a String, use a loop to print every character from the String on a new line.
Examples:
Input: hello
h
e
l
l
o
         */
       String word="hello";
       for (char i=0;i<=word.length()-1;i++){
           String each=""+word.charAt(i);
           System.out.println(each);
       }



    }
}
