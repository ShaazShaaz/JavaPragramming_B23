package Day9;

public class PassOrFail {
    public static void main(String[] args) {
        int score=50;
        if (score>=60){
            System.out.println("Passed");
        }
        if (score<60){
            System.out.println("failed");
        }

        System.out.println("---------------");

        if (score>=60){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
