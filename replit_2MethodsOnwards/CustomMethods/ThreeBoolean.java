package CustomMethods;

public class ThreeBoolean {
    /*
    threeLocks accepts 3 booleans and returns a boolean.
It returns true only if both a and b are true or c is true.
Hint: See truth table
     */
    public static void main(String[] args) {
       
       boolean result= threeLocks(0>1,3>2,1>2);
        System.out.println("result = " + result);
    }


    public static boolean threeLocks(boolean a,boolean b, boolean c){
        return ((a==true && b==true) || c==true)?true:false;

    }


}
