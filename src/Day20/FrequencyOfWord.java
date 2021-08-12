package Day20;

public class FrequencyOfWord {
    public static void main(String[] args) {
        /*
        write a program that can return the frequency of the a word Java from the sentence
        Ex:            sentence = "Java Java";
            output:
                2
         */

        String sentence="Java Java Java Java Java";
        int count=0;
        /*
        String str=sentence.substring(0,4);  // "Java"
        String str2=sentence.substring(1,5);   // "ava "
        String str3=sentence.substring(2,6);  // "va J"
        String str4=sentence.substring(3,7);  // "a Ja"
         */
        for (int i = 0; i <=sentence.length()-4; i++) {  // 0 1 2 3 4
            String each=sentence.substring(i,i+4);  // representing each 4 characters in sentence
            if (each.equals("Java")){
                count++;
            }
            System.out.println(count);
        }


    }
}
