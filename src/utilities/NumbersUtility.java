package utilities;

public class NumbersUtility {
    // is odd
    // is even
    // addition, subtraction multiplication
    public static void main(String[] args) {
        System.out.println(isOdd(4));
        //System.out.println(!isOdd(4));
        System.out.println(isEven(7));
        System.out.println(addition(3,4));
        System.out.println(subtraction(5,2));
        System.out.println(multiplication(8,2));
    }

    public static boolean isOdd(int n){
        return (n%2!=0);
    }

    public static boolean isEven(int n){
        return (n%2==0);
    }

    public static int addition(int n1, int n2){
        return (n1+n2);
    }

    public static int subtraction(int n1,int n2){
        return (n1-n2);
    }

    public static int multiplication(int n1,int n2){
        return (n1*n2);
    }

}
