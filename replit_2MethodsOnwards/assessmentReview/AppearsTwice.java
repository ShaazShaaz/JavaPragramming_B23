package assessmentReview;

public class AppearsTwice {
    /*
    Write a a method appearsTwice() that returns true if value of variable target appears
     only twice in the string sentence, otherwise return false.
`Examples:`
`Main.appearsTwice("java", "java is fun!")`
      `- returns false, because java appears only once.`
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
      `- returns true, because laptop appears twice.`
     */
    public static void main(String[] args) {
        System.out.println(appearsTwice("java","I love java"));
    }

    public static boolean appearsTwice(String target,String sentence){
      int frequency=0;
      sentence=sentence.toLowerCase();
      while (sentence.contains(target)){
          sentence=sentence.replaceFirst(target,"");
          frequency++;
      }
return (frequency==2)?true:false;
    }
}
