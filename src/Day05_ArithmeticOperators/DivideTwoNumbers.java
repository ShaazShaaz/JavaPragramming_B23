package Day05_ArithmeticOperators;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int n1=100;
        int n2= 40;  // 100/4= 2
        System.out.println(100.0%4);

        int num1=50;
        int num2=9;
        int result= num1/num2;
        int remainder= num1-num2*result;

        System.out.println(num1 + " divided by " + num2 + " is equal to " + result + " with a remainder of "
        + remainder);

    }
}
