package Day23;

public class InterviewNestedFrequencyCharacters {
    public static void main(String[] args) {
        String str="aabccc";
        String result="";  // a2b1c3
        String removeDup="";  // abc

        for (int i = 0; i <=str.length()-1 ; i++) {
            char each = str.charAt(i);

            if (removeDup.contains("" + each)){  // if the character already contained in removeDup
                continue;  // skip it
        }
            removeDup+=each;

        }
        for (int j = 0; j <=removeDup.length()-1 ; j++) { // will return each character of string

            char each = removeDup.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {  // will return the frequency of characters
                char ch = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            result+=""+each+count;
        }
        System.out.println(result);
    }
}
