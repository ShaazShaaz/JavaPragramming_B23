package Day7;

public class unaryPractice {
    public static void main(String[] args) {
        /*
        2. manually calculate the following code fragments:

          1. int a = 100;
             int b = -a++ + ++a - a-- * a-- % 2
         */
        int a = 100; //100+1=101+1=102-1=101-1=100
        int b = -a++ + ++a - a-- * a-- % 2;
             //-100 + 102 - 102 * 101 % 2
             //-100 + 102 - 10302 % 2
        // -100 + 102 - 0
        // 2

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
