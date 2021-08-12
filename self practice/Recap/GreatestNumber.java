package Recap;

public class GreatestNumber {
    public static void main(String[] args) {
        int num1=40;
        int num2=8;
        int num3=11;
        if (num1>num2 && num1>num3){
            System.out.println("the greatest number is: "+ num1);
        }else if (num2>num3 && num2>num1){
            System.out.println("the greatest number is: "+ num2);
        }else {
            System.out.println("the greatest number is: "+num3);
        }
    }
}
