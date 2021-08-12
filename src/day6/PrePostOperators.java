package day6;

public class PrePostOperators {

    public static void main(String[] args) {

        int a=50; //eventual= 50-1=49+1=50-1=49+1=50
        a= --a + a++ + a-- + a++;
        // 49 + 50 +48 + 50
        //197

        System.out.println(a);

        int x=4;
       int y= x * 4 - x++;
       //16-4=12

        System.out.println("x = " + y);
        System.out.println(y);
    }
}
