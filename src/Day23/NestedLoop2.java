package Day23;

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int j = 1; j <=6; j++) {

            for (int i = 1; i <= 20; i++) {
                System.out.print("*");
            }
            System.out.println();   // appends a new line after printing * 20 times
        }
        System.out.println("-------------------------");

        for (int j = 1; j <=8 ; j++) {
            for (int i = 1; i <= j; i++) {   // i is the num of *  and j is the num of lines
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
