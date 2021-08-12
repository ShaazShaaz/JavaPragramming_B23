package Day28_Methods;

public class CustomMethodsIntro {  // practiceWithoutMethod REDO with method
    // we can declare more than 1 independent methods in a class

    public static void main(String[] args) {
        printHello5Times();
        System.out.println("Shazia");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

    }

    public static void printHello5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }
}



