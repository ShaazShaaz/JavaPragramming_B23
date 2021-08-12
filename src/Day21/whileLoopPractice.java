package Day21;

public class whileLoopPractice {
    public static void main(String[] args) {
        String sentence="Java is fun, Java is cool";
        //              " is fun, Java is cool"
        //              " is fun, is cool"
        int countJava=0;
        // can also use the for loop and make substrings, but another way:
        // can use while loop

        while (sentence.contains("Java")){// if u want to ignore, sentence.toLowercase.contains("java")
            countJava++;
            sentence=sentence.replaceFirst("Java","");
        }   // loop will stop repeating when the condition doesn't meet anymore

        System.out.println(countJava);


    }
}
