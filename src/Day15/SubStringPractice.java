package Day15;

public class SubStringPractice {
    public static void main(String[] args) {
        String sentence="My favorite TV series is The Walking dead";
        String tvSeries=sentence.substring(25);
        System.out.println(tvSeries);

        String sentence2="Java is a fun language";
        String word=sentence2.substring(10,13);
        System.out.println(word);

        String word2=sentence2.substring(14);
        System.out.println(word2);



    }
}
