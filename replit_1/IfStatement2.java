public class IfStatement2 {
    public static void main(String[] args) {
        /*
        Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:

Enter a number:
10

10 is even
Enter a number:
10

10 is even
Enter a number:
33

33 is odd
Enter a number:
33

33 is odd
Enter a number:
0

0 is even
         */
         int num= 10;
         boolean isOdd= num%2!=0;
         boolean isEven= !isOdd;
         if (isEven){
             System.out.println(num + " is even");
         }
         if (!isEven){
             System.out.println(num + " is even");
         }

         int num1=33;
         if (num1%2!=0){
             System.out.println(num1 + " is odd");
         }
         if (num1%2==0){
             System.out.println(num1 + " is even");
         }

         int num2=0;
         if (num2%2==0){
             System.out.println(num2 + " is even");
         }
         if (num2%2!=0){
             System.out.println(num2 + " is odd");
         }

         double version=1.5;




    }
}
