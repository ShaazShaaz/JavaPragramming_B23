public class JavaPython {
    public static void main(String[] args) {
        /*
        Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
         such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length,
         including 0.
Example:input: javapython
output: true
         */
        String word="aajavapython";
        if (word.length()>=0) {
            boolean hasjava = word.startsWith("java") || word.substring(1).equals("java");
            System.out.println(hasjava);
        }else {
            System.out.println("false");
        }



    }
}
