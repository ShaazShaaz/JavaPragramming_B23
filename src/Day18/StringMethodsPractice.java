package Day18;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String str="abcd";
        int indexOfK=str.indexOf("k");
        if (indexOfK>=0) {
            System.out.println("string has character 'k'");
        }else {
            System.out.println("string does not have 'k'");
        }
        System.out.println("-------------------------");
        String sentence="I like to learn C#, C# is cool.";
        // verify if sentence has "Java"
        if (sentence.indexOf("Java")>=0){
            System.out.println("sentence has 'java'");
        }else {
            System.out.println("sentence doesnt have java");
        }
        System.out.println("--------------------");
        String sen="I love Java, Java is cool";
        // find if java is unique in the sentence
        boolean isUnique= sen.indexOf("Java")==sen.lastIndexOf("Java");
                            // 7                    13
                            //   false
        System.out.println("my variable is unique: "+isUnique);

        System.out.println("--------------------");
        String schoolName="Cybertek School";
        String name=schoolName.substring(0,schoolName.indexOf(" "));
        System.out.println(name);
        String sen2="I live in California, I go to Cybertek School";
        String name2= sen2.substring(sen2.indexOf("Cy"),sen2.lastIndexOf(" "));
        System.out.println(name2);
        System.out.println("-------------");

        String str2="Dog Cat Dog Cat";
        str2=str2.replace("Cat","Dog");
        System.out.println(str2);

        str2= str2.replaceFirst("Dog","Cat");
        System.out.println(str2);

        String n="Java Java Java";
       // n=n.replaceFirst("Java","C#").replaceFirst("Java","Python");
        // C# Java Java . C# Python Java

        n=n.replace("Java Java","C# Python");
        System.out.println(n);

        System.out.println("Yes".equals("yes"));// false   Upper case
        System.out.println("Yes".equalsIgnoreCase("yes"));// true  ignores uppercase






    }
}
