package day6;

public class PostPrePractice {
    public static void main(String[] args) {

        int a=1; // a=1-1=0+1=1-1=0-1=-1
        a=-a-- + a++ / -a-- * --a;
        //a= -1 + 0 / -1 * -1
        //-1 + 0 *-1
        //-1+0
        //-1

        System.out.println(-a-- + a++/-a--*--a);

        int x=10; //x=10+1=11-1=10+1=11-1=10
        x= ++x - x-- + x++ + --x;
         //11- 11 + 10 + 10
        //x= 0+10+10
        //x=20

        System.out.println(x);


        int y=50;// eventually y=50+1=51-1=50+1=51-1=50
        int z=-y++ + --y - ++y + y--;
        // -50 + 50 - 51 + 51
        //z= 0-51+51
        //z=-51+51
        //z=0

        System.out.println("z = " + z);
        System.out.println("y = " + y);

        int f= 20;//20+1=21-1=20+1=21-1=20
              int g= -f++ + --f - ++f +f--;
                  // -20 + 20 - 21 + 21
                  // 0
        System.out.println(g);

        int q= 100; // 100+1=101-1=100-1=99+1=100
        int r= q++ - --q + q-- + ++q;
        //100-99+99+100=200
        System.out.println(r);




    }
}
