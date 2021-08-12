public class Hi {
    public static void main(String[] args) {
        /*
        Print out the number of times that the string "hi" appears anywhere in the given string.
        Only lowercase "hi" should be counted.
Example:
input: abc hi how hi
output: 2
         */
        String input="abc hi how hi";
        String word="hi";
        int count=0;
        for (int i=0;i<=input.length()-word.length();i++){
            String each=input.substring(i,i+word.length());

            if (each.equals("hi")){
                count++;
            }
        }
        System.out.println(count);

    }
}
