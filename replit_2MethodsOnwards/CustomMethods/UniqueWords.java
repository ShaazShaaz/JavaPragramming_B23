package CustomMethods;

import day33_Methods.Str;

public class UniqueWords {
    /*
    Complete the void method printUniqueWords() that will print only unique words from an array of strings.
     Every single unique word should be printed from the new line.
Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
     */
    public static void main(String[] args) {
        String[] words={"java", "code", "python", "code", "rust", "code", "rust"};
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
String unique="";
        for (String each:words) {
            if (!unique.contains(each)){
                unique+=each;
            }

        }
        System.out.println(unique);
    }
}
