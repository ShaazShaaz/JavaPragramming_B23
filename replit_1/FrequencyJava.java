public class FrequencyJava {
    public static void main(String[] args) {
        /*
        Print the number of times that the string "java" appears anywhere in the given string word
Example:
input: javaxjava
output: 2
         */
        String word="javaxjava";
        String str="java";
        int count=0;
        for (int i=0;i<=word.length()-str.length();i++){
            String each=word.substring(i,i+str.length());

           if (each.equals("java")){
               count++;
           }

        }
        System.out.println(count);


    }
}
