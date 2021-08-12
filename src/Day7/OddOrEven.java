package Day7;

public class OddOrEven {
    public static void main(String[] args) {
        /*
        even: number%2==0;
        odd: number%2!=0;
            : even==false;
            : number%2>0;
         */
        int number= 101;
        boolean even= number%2==0;
        boolean odd= even==false;
        //boolean odd = number%2!=0;
        System.out.println(number + " is even number: " + even);
        System.out.println(number + " is odd number: " + odd);


    }
}
