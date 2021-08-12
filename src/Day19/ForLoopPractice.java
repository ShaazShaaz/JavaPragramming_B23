package Day19;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i=0;i<=1000;i++){  // i :0,1,2,3,4.....1000
            System.out.print(i+ " "); //for numbers to be printed in one line
        }
        System.out.println();  // so that hello gets printed in new line
        System.out.println("hello");
        System.out.println("------------------------");
        // to get all odd numbers from 1-100
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
           // System.out.println();  // to make sure
            //System.out.println("----------");
            // if u dont want to use additional if statement
            //for (i=1;i<=100;i+=2){
            //    System.out.print(i+" ");
           // }
          // System.out.println();
          //  System.out.println("---------------");

        }


        for (int i=1;i<101;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        String odds="";
        String evens="";
        for (int i=1;i<101;i++){
            if (i%2!=0){
                odds += i+" ";
            }else {
                evens += i+" ";
            }
        }

        System.out.println(odds);
        System.out.println(evens);







    }
}
