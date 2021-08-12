import java.util.Arrays;
import java.util.Scanner;

public class ArrayDiving {
    public static void main(String[] args) {
        /*
        In the sport of diving, seven judges award a score between 0 and 10, where each score may
        be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to
determine the divers score.
Flow:
Accept the 7 scores from the judges
Accept the difficulty number
Display the final score
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
         */
Scanner input=new Scanner(System.in);
        float[] score = new float[7];


        float totalSum = 0;
        float diverScore=0;
        float total=0;


        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i]=input.nextFloat();
            if (score[i] >= 0 && score[i] <= 10) {
                totalSum+=score[i];
            }

        }
        Arrays.sort(score);
        System.out.println("Enter difficulty:");
        float degreeDiff= input.nextFloat();

        if (degreeDiff>=1.2 && degreeDiff<=3.8){
            total=totalSum-score[0]-score[score.length-1];
        }else {
            System.out.println("Difficulty out of range");
        }
        float diffAfterMultip=total*degreeDiff;
        diverScore= (float) (diffAfterMultip*0.6f);

        System.out.println(diverScore);

    }

        //System.out.println(highest);
        //System.out.println(smallest);
       // System.out.println(sumOfRem);

}
