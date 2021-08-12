package Day19;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String word="ababababab";
        String result="";  // ab

        for (int i = 0; i <=word.length()-1; i++) {
            if (!result.contains(""+word.charAt(i)))
            result+=word.charAt(i);
        }
        System.out.println(result);

    }
}
