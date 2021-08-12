package Day8;

public class GradeReport2 {
    public static void main(String[] args) {
        int score=95;
        boolean madeA= score>=90 && score<=100;
        boolean madeB= !madeA && score>=80;  // did not make A and score is >=80
        boolean madeC= !madeA && !madeB && score>=70;
        boolean madeD= !madeA && !madeB && !madeC && score>=60;
        boolean madeF= !madeA && !madeB && !madeC && !madeD && score<60;

        if (madeA){
            System.out.println("you made A");
        }

        if (madeB){
            System.out.println("you made B");
        }

        if (madeC){
            System.out.println("you made C");
        }

        if (madeD){
            System.out.println("you made D");
        }

        if (madeF){
            System.out.println("you made F");
        }

    }
}
