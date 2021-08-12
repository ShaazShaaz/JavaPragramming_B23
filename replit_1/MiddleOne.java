public class MiddleOne {
    public static void main(String[] args) {
        /*
        You have a word, do the following:
When word has odd number of characters and:
3 or more characters, print middle letter
         */
        String word="la";

        if (word.length()%2!=0){
            if (word.length()>=3){
                System.out.println(word.charAt(word.length()/2));
            }else if (word.length()==1){
                System.out.println(word+word+word);
            }
        }else if (word.length()%2==0){
            if (word.length()>=4){
                System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2));
            }else if (word.length()==2){
                System.out.println(word+word);
            }
        }
    }
}
