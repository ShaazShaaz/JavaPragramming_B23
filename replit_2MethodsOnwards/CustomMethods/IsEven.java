package CustomMethods;

public class IsEven {
    /*
    isEven accepts a number and checks if it is even. If the given number is even return true,
     otherwise return false.
Examples:
isEven(1) --> false
isEven(8) --> true
     */
    public static void main(String[] args) {
        boolean n=isEven(10);
        System.out.println(n);
    }

    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }else {
            return false;
        }


    }

}
