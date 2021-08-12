package Day32_MethodOverloading;

public class WarmUpTask {
    /*
     create a method that can find the sum of two numbers
                    method name: sumOf2Numbers

    2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers

    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers
     */
    public static void main(String[] args) {
        // 10+12
       int sum1=sumOf2Numbers(10,12);
        System.out.println(sum1);

        // 10+12+15
        int sum2=sumOf3Numbers(10,12,15);
        System.out.println(sum2);

        // 10+12+15+20
        int sum3=sumOf4Numbers(10,12,15,20);
        System.out.println(sum3);

        //10+20
        int r1= sum(10,20);

        // 10,20,30
        int r2=sum(10,20,30);

        //10,20,30,40
        int r3=sum(10,20,30,40);

        //2.5,3.2
        double r4=sum(2.5,3.2);

        //2.5,3.2,4.5
        double r5=sum(2.5,3.2,4.5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);



    }

    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }
    public static int sumOf3Numbers(int a, int b, int c){
        return a+b+c;
    }
    public static int sumOf4Numbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //------------------METHOD OVERLOADING--------------------------------

    public static int sum(int a, int b){ return a+b; }

    public static double sum(double a, double b){return a+b;}

    public static int sum(int a, int b, int c){ return a+b+c;}

    public static double sum(double a, double b, double c){return a+b+c;}

                         //  1     2       3     4                 3             7
    public static int sum(int a, int b, int c,int d){ return sum(sum(a,b) , sum(c,d));}
       // alternate option                        //                3   +      7 ==10



}
