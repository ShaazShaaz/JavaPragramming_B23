package day6;

public class UnaryOperators {
    public static void main(String[] args) {

        int a=100;

        ++a;  // increases the value of a by 1
        System.out.println(a);

        int b=100;

        --b;
        System.out.println("b = " + b);

        int x= 10;


        System.out.println(x++); // POST first pass current value, then change by 1
        System.out.println("x = " + x);


        int n1=50;
        int n2= n1++;
        //n2=50, n1=51
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        
        int a1=100;
        int a2= ++a1;

        System.out.println("a2 = " + a2);


        int r= 200;
        System.out.println(r++); // 200. delay
        System.out.println("r = " + r);

        int y= 100;
        int result=y++ +1;
        //        =100+1=101 but will delay
        System.out.println("y = " + y);
        System.out.println("result" + y);

        int z=100;
        int result1= ++z +1;

        System.out.println("z = " + z);
        System.out.println("result1 = " + result1);

        int p1= 50;
        int p2= p1++ -1;
        System.out.println(p1);//51
        System.out.println("p2 = " + p2);// 49

        int f=10;
        int g=f-- + 2;
        System.out.println(f);// 9
        System.out.println("g = " + g);// 12





    }
}
