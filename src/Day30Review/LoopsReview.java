package Day30Review;

public class LoopsReview {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------");

        String str="Java";
        for (int i = 0; i <=str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("-------------------");
        // to get the alphabets
        for (int i = 1,ch=65; i <= 26; i++,ch++) {
            System.out.println(i+". "+(char)ch);
        }

        for (int i = 26,ch=90; i >=1; i--,ch--) {
            System.out.println(i+". "+(char)ch);
        }

        for ( char i='A',j = 'a'; i<='Z'; i++,j++) {
            System.out.println(i+", "+j);
        }
        System.out.println("----------------------------");
         // PALINDROME
        String word="Python";
        String reverse="";
        for (int i = word.length()-1; i >=0; i--) {
        reverse+=word.charAt(i);

        }
        boolean isPalindrome=word.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);
        
        
    }
}
