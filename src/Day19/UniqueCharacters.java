package Day19;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word="aabcc";
        String result="";
        for (int i = 0; i <=word.length()-1; i++) {
            char ch=word.charAt(i); // a,a,b,c,c
            boolean isUnique=word.indexOf(ch)==word.lastIndexOf(ch);
            // if the first and last index number of the characters are the same, then it is unique
          if (isUnique){
              result+=ch;
          }


        }
        System.out.println(result);




    }
}
