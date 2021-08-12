package Day9;

public class IfStatements {
    public static void main(String[] args) {
        /*
        write a program that can print out the maximum number between two different numbers
            Ex:
                num1 = 20;
                num2 = 30;

            output:
                    30 is the maximum number
         */

        int num1=20;
        int num2=30;
        if (num1>num2){
            System.out.println( num1 + " is the maximum number");
        }
        if (num2>num1){
            System.out.println( num2 + " is the maximum number");
        }
        System.out.println("-------------------");
        if (num1>num2){
            System.out.println( num1 + " is the maximum number");
        }else{
            System.out.println(num2 + " is the maximum number");
        }
    }
}
