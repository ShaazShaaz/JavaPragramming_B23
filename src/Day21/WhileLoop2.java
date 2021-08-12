package Day21;

public class WhileLoop2 {
    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            System.out.println("hello cybertek");
        }
        System.out.println("-----------");
        int j=0;  // need to declare the initialization before the condition
        while (j<3){
            System.out.println("hello cybertek");
            j++;  // increment should be declared after the statement
        }


    }
}
