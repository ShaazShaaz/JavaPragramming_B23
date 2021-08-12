package Day20;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int i = 0; i <=5 ; i++) {
            if (i==3){
                break;  // exits loop
            }
            System.out.println(i); // will print all numbers frm 0-2 instead of 0-5

        }

        for (int i = 0; i <=5; i++) {
            if (i==3){
                continue;  // skip
            }
            System.out.println(i);
        }
        System.out.println("-------------------------");
        // print all odd numbers between 1~10 . must use continue

        for (int i = 0; i <=10 ; i++) {
            if (i%2==0){
                continue; // if i is even continue statement will skip all even num
            }
            System.out.println(i);

        }
        System.out.println("--------------------");
        // print all numbers between 1~100 that are evenly divisible by 3 and 5

        for (int i = 1; i <=100 ; i++) {
            if (i%15!=0){
                continue; // skips all nums that are not evenly divisible by 15(3 and 5)
            }
            System.out.println(i);
        }
        // print all the alphabets A~Z except for D,T,X

        for (char i = 'A'; i <='Z'; i++) {
            if (i=='D' || i=='T' || i=='X'){
                continue;

            }
            System.out.print(i+" ");
        }



    }
}
