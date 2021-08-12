package Day15;

public class StringMethods2 {
    public static void main(String[] args) {
       String sentence="Java Programming language";
       // index:        0123
        String name= sentence.substring(0,3+1);// ending index is always excluded
        System.out.println(name);

        String s2="Cybertek School";
        //         01234567891011121314
        String name1=s2.substring(0,8);
        System.out.println(name1);

       // String name2=s2.substring(9,15);
        String name2=s2.substring(9);// if its the last character, no need to write the last index.
        System.out.println(name2);

        System.out.println("----------------------");
        // create a substring from "programming language"
        String sentence2="Java is a programming language";
        //                0123456789
        String name3=sentence2.substring(10);
        System.out.println(name3);
        // only "programming"
        String name4=sentence2.substring(10,21);
        System.out.println(name4);

     System.out.println("--------------------------");

     // Replace method
     String sentence3="Python is an easy language";
     //to replace python with java, use replace method
     sentence3=sentence3.replace("Python","java");

     System.out.println(sentence3);

     String sentence4="C# is a programming language. I like learning C#, C# is the best";
     sentence4=sentence4.replace("C#","Java");
     System.out.println(sentence4);

     String sentence5="Dog is friendly, Dog is loyal, I love dogs";
     sentence5=sentence5.replace("dog","cat");
     System.out.println(sentence5);
              // RECAP
     String str="Batch 23";
     // index:   01234567
     // char ch1=str.charAt(200); or (-1) will give error cuz index is out of range

     System.out.println(str.length()); // 8

     str=str.toUpperCase();
     System.out.println(str);// BATCH 23

     str=str.toLowerCase();
     System.out.println(str);// batch 23

     str=str.substring(0,5);
     System.out.println(str); // batch

     String s1="how are you?";
     s2=s1.substring(4,7); // are
     System.out.println(s2);







    }
}
