package Recap;

public class EqualNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=11;
        boolean isEqual=a==b;
        System.out.println("a is equal to b: "+ isEqual);
        if (isEqual){
            System.out.println("a=b");
        }
        if (!isEqual){
            System.out.println("a!=b");
        }
    }
}
