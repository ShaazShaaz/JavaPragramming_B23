package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfPractice {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));
        ArrayList<Integer> gradeOfA=new ArrayList<>(scores);
        gradeOfA.removeIf(p -> p<90 );

        ArrayList<Integer> gradeOfB=new ArrayList<>(scores);
        gradeOfB.removeIf(p -> p>=90 || p<80);

        ArrayList<Integer> gradeOfC=new ArrayList<>(scores);
        gradeOfC.removeIf(p -> p>79 || p<70);

        ArrayList<Integer> gradeOfD=new ArrayList<>(scores);
        gradeOfD.removeIf(p -> p>69 || p<60);

        ArrayList<Integer> gradeOfF=new ArrayList<>(scores);
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfA = " + gradeOfA);


    }
}
