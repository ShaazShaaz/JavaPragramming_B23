package Day30Review;

public class LoopsReview3 {
    public static void main(String[] args) {
        String sentence="I love Java, Java is fun";
        // take out the word Java  while loop-- 1. I love, java is fun; 2. I love, is fun
        String word="Java";
        int count=0;

        while (sentence.contains("Java")){  // will run until no more "Java" is left
            sentence=sentence.replaceFirst(word,"");
            count++;
        }

        System.out.println(count);
        System.out.println("--------------------------------");
           // NESTED LOOP
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
          // UNIQUE CHARACTER
        String str="aabcccd";
        for (int j = 0; j <=str.length()-1; j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(ch+" is unique");
            }
        }


    }
}
