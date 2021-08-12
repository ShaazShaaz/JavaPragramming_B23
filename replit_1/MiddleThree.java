public class MiddleThree {
    public static void main(String[] args) {
        /*
        Given a String variable word print the middle three characters if the word is an odd number
 of characters and has more than 5 characters. If the word does not meet the requirements print invalid.
fifteen ==> fte
         */
        String word="fifteen";
        int middle=word.length()/2;
        if (word.length()%2!=0 && word.length()>5){
            System.out.println(word.substring(middle-1, middle+2));
        }



    }
}
