package CustomMethods;

public class Sign {
    /*
    Given a method sign write the code so that its takes a number arguement and tells you if
    its positive, negative or zero.
for example :
sign(5)  => positive
sign(-30) => negative
sign(0)  => zero
     */
    public static void main(String[] args) {
        int num=0;
        sign(num);
    }

    public static void sign(int n){
       String result="";
        result=(n>0)?"positive":(n<0)?"negative":"zero";
        System.out.println(result);

    }
}
