public class ArrayLongestWord {
    public static void main(String[] args) {
        /*
        Given the array words find and print the word with the largest length.
        Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
Outputs: jaaaaavvaaaaaaaaaa
         */
        String[] words={"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
        String longestWord="";
            for (String each:words){
                if (each.length()>longestWord.length()){
                    longestWord=each;
                }
            }
        System.out.println(longestWord);
    }
}
