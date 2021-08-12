package Day21;

public class BreakVsExit {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {   // 0,1,2,3,4 times

            if (i==3){
                break;
            }
            System.out.println("Cybertek");  // prints cybertek only 3 times
        }
        System.out.println("batch 23");   // prints as it is, break only executes what is in the block
    }
    // System.exit(0);  will terminate everything... none of the code fragment after it will get executed
}
