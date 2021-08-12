

public class BiggestNumber {
    public static void main(String[] args) {
        /*
        Write a program that checks for the biggest of 3 numbers.
        you get 3 int variables: n1 , n2 and n3
if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
         */
        int n1=8;
        int n2=8;
        int n3=9;

            if (n1 > n2 && n1 > n3) {
                System.out.println("n1 is bigger");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println("n2 is bigger");
            }else {
                System.out.println("n3 is bigger");
            }
        }


    }

