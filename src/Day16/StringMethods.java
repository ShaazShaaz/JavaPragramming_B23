package Day16;

public class StringMethods {
    public static void main(String[] args) {
        String email="Cybertek@yahoo.com";
        email=email.replace("yahoo","gmail");// creates a new version
        // of string but we need to assign it back to email
        System.out.println(email);

        String sentence="C# is cool, C# is fun";
       // sentence=sentence.replace("C#", "Java");
        sentence=sentence.replaceFirst("C#", "java");
        System.out.println(sentence);

        String s="Cat Dog Cat Dog Cat";
        // s=s.replace("Cat", "Dog");  // no cat
        s=s.replaceFirst("Cat", "Dog");  // 2 cat will remain
        System.out.println(s);
        System.out.println("-----------------------");

        // indexOf method: TO GET THE INDEX NUMBER OF A CHARACTER IN A GIVEN STRING
        String sentence2="Java is a cool language";
        int indexOfFirstA=sentence2.indexOf("a");
        int indexOfSecondA=sentence2.indexOf("a ");  // ALWAYS PRINTS THE FIRST CHARACTER'S INDEX
        int indexOfThirdA=sentence2.indexOf("a c");  // can also write (" a ")+1
        int indexOfFourthA=sentence2.indexOf("an"); // also ("la")+1
       // int indexOfFifthA=sentence2.indexOf("ag"); // also ("ua")+1
        int indexOfFifthA=sentence2.lastIndexOf("a");// will give index of last given character
                                                          // (first from the end)

        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfFourthA);
        System.out.println(indexOfFifthA);

        System.out.println("------------------");
        String name="   ";
        name=name.trim();
        boolean r1=name.isEmpty();  // determines if the string is empty or not
        //                         can only be assigned to boolean
        System.out.println(r1);
        System.out.println("-------------------");

        // equals()   or equalsIgnoreCase()

        String n1="Cat";       // String pool
        String n2=new String("Cat"); // Java heap
        String n3=new String("Cat");  // java heap.. n1 and n2 will hold separate memory
        System.out.println(n1.equals(n2));  //True but n1==n2 will give false
        System.out.println(n2.equals(n3));  // True but n2==n3 will give false

        String m1="Java";
        String m2="java";
        System.out.println(m1==m2);// false. cuz
        System.out.println(m1.equals(m2));// false due to case sensitivity
        System.out.println(m1.equalsIgnoreCase(m2));// true. ignores case sensitivity

        String s1="abc";
        String s2="abc";
        System.out.println("s1==s2"+s1==s2);
    }
}
