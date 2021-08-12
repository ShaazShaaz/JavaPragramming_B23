package Day21;

public class WhilLoopPractice2 {
    public static void main(String[] args) {
        /*
        print all even numbers between1~100 but dont use for loop
         */

        int i=1;
        while (i<=100){
            if (i%2==0) {
                System.out.print(i+" ");
            }
            i++;

        }
        System.out.println();
        System.out.println("--------------------");
        for (int j = 1; j <=10; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }


    }
}
