package CustomMethods;

public class HamletCode {
    /*
    The famous quote is "to be or not to be" is a classic example of boolean logic.
the hamletQuote method only returns true if one or both of the boolean parameters is true.
Examples:
hamletQuote(true, false)
returns true
hamletQuote(false,true)
returns true
     */
    public static void main(String[] args) {
        System.out.println(hamletQuote(true,true));
    }


    public static boolean hamletQuote(boolean toBe, boolean notToBe){
if (toBe==false && notToBe==false){
    return false;
}else {
    return true;
}
    }


}
