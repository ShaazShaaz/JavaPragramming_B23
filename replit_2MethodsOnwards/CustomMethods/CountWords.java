package CustomMethods;

public class CountWords {
    /*
    wordCount accepts String and returns how many words are in the given String
Example:
wordCount("foo bar")
returns 2
     */
    public static void main(String[] args) {
        String s="too far away";
        System.out.println(wordCount(s));
    }

    public static int wordCount(String words){
        String[] str=words.split(" ");
        int count=0;
        for (String each:str){
            count++;
        }
return count;
    }


}
