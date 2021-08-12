package CustomMethods;

public class CountLetters {
    /*
    Write a method countLetters that can count letters in a given string and return a new string
     in the given format:
number of letters + letter
Example:
input: countLetters("aaabbcccc");
output: "3a2b4c"
     */
    public static void main(String[] args) {
        System.out.println(countLetters("aaabbcccc"));
    }

    public static String countLetters(String str){

        String result="";
        String removedDup="";

        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            if (!removedDup.contains(""+ch)){
                removedDup+=ch;
            }
        }
        for (int i = 0; i < removedDup.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (removedDup.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=""+count+removedDup.charAt(i);
        }

        return result;
    }
}
