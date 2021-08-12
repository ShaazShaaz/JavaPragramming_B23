package Day15;

public class StringMethods {
    public static void main(String[] args) {
        String str="Muhtar";
        char ch=str.charAt(0);
        System.out.println("ch = " + ch);

        String word="Cybertek School";
        char ch1= word.charAt(9);// index number of S is 9
        System.out.println("ch1="+ ch1);

        String word2="Java";
        char ch3=word2.charAt(2);
        System.out.println("ch3:"+ ch3);

        String sentence="Hello everyone. How are you today?";
        int totalNumber=sentence.length();
        System.out.println("total number: "+totalNumber);

        // find the last index number
        String s1="Cybertek"; // total num of char=8
        char firstCharacter=s1.charAt(0);
        char lastCharacter=s1.charAt(7);
        int lastIndex=s1.length()-1;
        System.out.println(lastIndex);
        // in order to get the last index number we need to subtract 1 from the length of string.

        //concat method:
        String firstName="John";
        String lastName="Senol";
        String fullName=firstName+" "+lastName;
      // String concat-method:2nd option-  String fullName2=firstName.concat(" ").concat(lastName);
        System.out.println("fullName = " + fullName);
        System.out.println("------------------------");

        String s="cybertek";
       // s.toUpperCase();  cybertek
        s=s.toUpperCase();// CYBERTEK
        System.out.println("s = " + s);// will give lower case cybertek becuz String objects
        // cant be modified.At ln 37 Lowercase value has been assigned to s.
        // A new string will be created.

        System.out.println("--------------------");

        String s2="JAVA PROGRAMMING LANGUAGE";
        s2=s2.toLowerCase();
        System.out.println(s2);

        String name="muhtar";
        name=name.toUpperCase();
        System.out.println(name);
        // if you want it back to muhtar,
        name= name.toLowerCase();
        System.out.println(name);
        System.out.println("-----------------");

        String schoolName="       Cybertek   School";  // will include white spaces
        schoolName=schoolName.trim(); // Cybertek School
        System.out.println(schoolName);


    }
}
