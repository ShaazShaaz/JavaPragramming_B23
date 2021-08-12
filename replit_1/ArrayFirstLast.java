public class ArrayFirstLast {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word and print first and last letter
        of each element in separate lines.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print:
ho
wy
by
ae
ne
         */
        String[] words={"hello", "why", "by", "apple" , "note"};
        for (String each:words){
            System.out.println(each.substring(0,1)+each.substring(each.length()-1));
        }
    }
}
