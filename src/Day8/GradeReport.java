package Day8;

public class GradeReport {
    public static void main(String[] args) {
        /*
        score= given
        A: >=90 and <=100
        B: >=80 and <=89
        C: >=70 and <=79
        D: >=60 and <=69
        F: <60
         */

        int score= 50;
        if (score>=90 && score<=100){
            System.out.println("you made an A- excellent");
        }

        if (score>=80 && score <=89){
            System.out.println("its a B");
        }

        if (score>=70 && score<=79){
            System.out.println(" better luck... you got C");
        }

        if (score>=60 && score<=69){
            System.out.println("need to improve- you got D");
        }

        if (score<60){
            System.out.println(" you have Failed- F");
        }
    }
}
