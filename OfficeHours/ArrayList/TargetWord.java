package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TargetWord {
    public static void main(String[] args) {
        /*
        : Target Words
  Given an ArrayList of Strings and a target word (String) print how many times the target word
   is in the ArrayList
                    Ex:
                    Input:
                        ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
                        Target: java
                        Output: 2
         */
        ArrayList<String> words=new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        String targetWord="java";
        int count=0;
        for (String each:words){
            if (each.equals(targetWord)){
                count++;
            }
        }
        System.out.println(count);
        //option2
       /* words.removeIf(p->p.equals(targetWord));
        System.out.println(words);
        System.out.println(words.size());

        */
        // option 3
        System.out.println(Collections.frequency(words, targetWord));
        // Collections method
        Collections.sort(words);
        System.out.println(words);

        Collections.reverse(words);
        System.out.println(words);

        Collections.swap(words,0,1);
        System.out.println(words);

        Collections.replaceAll(words,"javascript","java");
        System.out.println(words);


    }
}
