package Day05_ArithmeticOperators;

public class ArithmeticOperatorsPractice {
    public static void main(String[] args) {
        int number=20;
        boolean isEvenlyDivisibleBy3= number%3==0,
                isEvenlyDivisibleBy5= number%5==0; // if the remainder of the no. divided by 5 is 0

        System.out.println(number + " is evenly divisible by 3: " + isEvenlyDivisibleBy3);
        System.out.println(number + " is evenly divisible by 5: " + isEvenlyDivisibleBy5);


    }
}
