package Day14;

import java.util.Scanner;

public class TernaryPracticeNested {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=scan.nextInt();
        String name=(number>=1 && number<=7)?
                (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":
                        (number==5)?"Friday":(number==6)?"Saturday":"Sunday"
                :"No such day";
        // if you want to do by switch statement, ternary cannot be used. an if statement must be applied.
        System.out.println(name);
        scan.close();
    }
}
