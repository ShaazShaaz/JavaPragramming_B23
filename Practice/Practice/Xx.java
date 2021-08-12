package Practice;

public class Xx {
    public static void main(String[] args) {
        /*
        Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
        otherwise print the string unchanged.
Example:
input: xHiX
output: Hi
         */
        String word="XHiX";
        String result="";
        if (word.charAt(0)=='x' || word.charAt(word.length()-1)=='x'){
            result=word.substring(1,word.length()-1);
        }else if (word.charAt(0)=='X' || word.charAt(word.length()-1)=='X'){
            result=result=word.substring(1,word.length()-1);
        }else {
            result=word;
        }
        System.out.println(result);

    }
}
