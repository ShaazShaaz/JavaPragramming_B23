package OfficeHours;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        write a program that can return the sum of the digits of an integer. do not use STring manipulations
         */
        int sum=0;
        int num=1234;  // 10
        /*
        1234%10 = 4     1234/10 = 123
        123%10 = 3      123/10 = 12
        12%10 = 2       12/10 = 1
        1%10 = 1        1/10 = 0
         */


       while (num>0){
          // sum=sum+(num%10);
           sum+=(num%10);
          // num=num/10;
           num/=10;

       }
        System.out.println(sum);
    }
}
