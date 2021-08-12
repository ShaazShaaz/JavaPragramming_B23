package Day7;

public class warmup {
    public static void main(String[] args) {
        /*
        1. write a program that can swipe two variables' value by using a temporary variable
    ex:
        if a= 10, b=15

    output:
        a = 15
        b = 10

2. manually calculate the following code fragments:

          1. int a = 100;
             int b = -a++ + ++a - a-- * a-- % 2
         */

        int a=200;
        int b=300;
        int c=a; //c=200

        a=b; //a=300
        b=c;//b=300

        System.out.println("a = " + a); //300
        System.out.println("b = " + b);//200

        //*
        double salary= 100000;
        // salary= salary * 2
        salary *= 2;
    }
}
