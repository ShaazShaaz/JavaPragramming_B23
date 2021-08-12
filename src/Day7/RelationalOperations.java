package Day7;

public class RelationalOperations {
    public static void main(String[] args) {
        // > , >= using OR logic
        System.out.println(10>11);
        System.out.println(10>=10);
        System.out.println(11>=9);

        // <, <=
        System.out.println(1000<100);
        System.out.println(1000<10000);
        System.out.println(1000<=1000);

        //==, equal   != NOT equal  can be used for numbers, characters, texts
        System.out.println(5==6);//false
        System.out.println(5!=6);//true

        System.out.println('a'=='A');
        System.out.println("Java"=="java");
        System.out.println("Java" != "java");


    }
}
