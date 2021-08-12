package Day12;

public class FizzAndBuzz {
    public static void main(String[] args) {
        /*
         write a program that can print any number between 1 ~ 10, but for number which
          is a multiple of 3 print "Fizz" instead of the number and for number which
           is a multiple of 5, print "Buzz" instead of the number, and for number which
            is a multiple of both 3 and 5 both print "FizBuzz" instead of the number.
                  MUST use switch statement
         */
        int n=5;
        String name="";

           switch (n){
               case 3:
               case 6:
               case 9:
                   name="Fizz";
                   break;
               case 5:
               case 10:
                   name="Buzz";
                   break;
               case 1:
                   name="one";
                   break;
               case 2:
                   name="two";
                   break;
               case 4:
                   name="four";
                   break;
               case 7:
                   name="seven";
                   break;
               case 8:
                   name="eight";
                   break;
               default:
                   name="invalid";

        }
        System.out.println(name);



    }
}
