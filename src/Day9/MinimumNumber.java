package Day9;

public class MinimumNumber {
    public static void main(String[] args) {
        /*
         write a program that can print out the minimum number between two numbers

        Ex:
            num1 = 20;
            num2 = 30;

            output:
                20 is the minimum number
         */
        int num1=20;
        int num2=30;
        if (num1<num2){
            System.out.println(num1 + "is the minimum number");
        }
        if (num2<num1){
            System.out.println(num2 + "is the minimum number");
        }
    }
}
