package Day8;

public class OddOrEven {
    public static void main(String[] args) {
        int number= 100;
        boolean odd= number%2!=0;
        if (odd){
            System.out.println(number+ " is odd number");
        }
        if (!odd){
            System.out.println(number + " is not odd number");
        }

    }
}
