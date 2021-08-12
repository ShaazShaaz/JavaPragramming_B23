package Day8;

public class IfStatement {
    public static void main(String[] args) {
        int score=95;
        boolean passed= score>=60;
        if (passed) { // if student is passed
            System.out.println("Congrats you are passed");

        }

        if (!passed){ // if student failed
            System.out.println("failed the exam");

        }
        }
}
