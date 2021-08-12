package Day17;

public class StringMethods {
    public static void main(String[] args) {
        String sentence="My favorite programming language is C#, Java, Javascript";
        boolean hasPython=sentence.contains("Python");
       // boolean hasPython2=sentence.toLowerCase().contains("python");   just for ignorecase
        System.out.println(hasPython);
       // System.out.println(hasPython2);
        boolean hasJava=sentence.contains("Java");
        System.out.println(hasJava);

        System.out.println("--------------------");

        String sen="Cybertek is the best";
        boolean startsWithCybertek=sen.startsWith("Cybertek");
        System.out.println(startsWithCybertek);

        boolean endsWithBest= sen.endsWith("best");
        System.out.println(endsWithBest);
    }
}
