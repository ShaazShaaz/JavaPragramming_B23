package Day1;

public class RelationalUnaryShorthandOperators {
    public static void main(String[] args) {
        // declaration
        boolean cond=true;
        int a=10,b=10;
         // pre and post inc
        System.out.println("====data=====");
        System.out.println("cond= " + cond); //true
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        System.out.println("cond= " + !cond); //false  !!cond= true

        System.out.println(a++); // 10
        System.out.println(a); //11
        System.out.println(++b); //11

        //pre and post dec

        System.out.println(--a); //10
        System.out.println(b--); //print11   in memory 10


        // relational operators
        // a=10  b=10
        System.out.println(a>--b); // true
        // a=10 b=9
        System.out.println(a>=b); // true
        System.out.println(a<b); // false
        System.out.println(a<=++b); // true
        //a=10 b=10
        System.out.println(a==b); // true
        System.out.println(a!=--b); // true

        //SHORTHAND OPERATORS

        //a=a+b;
        a+=b;
        System.out.println(a);
        //a= a-b
        a-=b;
        System.out.println(a);

        String name="Cybertek";
        //name=name+" school";
        name+=" School";
        System.out.println("name:" + name);




    }
}
