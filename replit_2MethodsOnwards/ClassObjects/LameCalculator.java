package ClassObjects;

public class LameCalculator {
    /*
    The LameCalculator class has instance methods that can do simple math operations
    on two numbers. Create the methods: plus, minus, multiply and divide.
All the methods get two ints then the method does the required math operation and returns
the result as an int.
Example:
LameCalculator lc = new LameCalculator();
lc.plus(1,1)
returns:2
lc.minus(1,1)
returns:0
lc.multiply(2,1)
returns:2
lc.divide(10,2)
returns:5
     */

    public int num1,num2;

    public void setInfo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int plus(int n1,int n2){
        return n1+n2;
    }
    public int minus(int n1,int n2){
        return n1-n2;
    }
    public int multiply(int n1,int n2){
        return n1*n2;
    }
    public int divide(int n1,int n2){
        return n1/n2;
    }
}
