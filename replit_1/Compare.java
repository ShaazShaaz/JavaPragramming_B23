public class Compare {
    public static void main(String[] args) {
        /*
        Check if they are equal
Comparison should be case sensitive. "java" and "JaVa" are not equal.
if they are equal output "word1 equals word2"
otherwise output "word1 does not equal word2"
Input:java java
output: word1 equals word2
         */
        String word1="java";
        String word2="Java";
        if(word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else {
            System.out.println("word1 does not equal word2");
        }
    }
}
