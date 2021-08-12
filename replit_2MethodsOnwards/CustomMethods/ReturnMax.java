package CustomMethods;

public class ReturnMax {
    /*
    Finish the method max which has two parameters, x and max.
if x is bigger than max return x
if max is bigger than x return max
all other cases return x
Example:
max(1,10) -> 10
     */
    public static void main(String[] args) {
        int n=max(2,4);
        System.out.println(n);
    }

    public static int max(int x, int max){
        int result=0;
        if (x>max){
            result=x;
        }else if (max>x){
            result=max;
        }else {
           result=x;
        }
return result;
    }



}
