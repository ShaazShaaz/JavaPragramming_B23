public class RepliJavaPython {
    public static void main(String[] args) {
        /*
        Given a string, print out true if the number of appearances of "java" anywhere in the
         string is equal to the number of appearances of "python" anywhere in the string
         (case sensitive).
Example:
input: We study java not python
output: true
         */
        String sentence="We study java not python";
        String word1="java";
        String word2="python";
        int countOfJava=0;
        int countOfPython=0;
        for (int i=0;i<=sentence.length()-word1.length();i++){
            String eachJava=sentence.substring(i,i+word1.length());
          if (eachJava.equals("java")){
              countOfJava++;
          }
        }
        for (int i=0;i<=sentence.length()-word2.length();i++){
            String eachPython=sentence.substring(i,i+word2.length());
            if (eachPython.equals("python")){
                countOfPython++;
            }
        }

if (countOfJava==countOfPython){
    System.out.println("true");
}else {
    System.out.println("false");
}

    }
}
