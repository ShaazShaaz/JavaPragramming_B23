package Day29CustomMethods;

public class ReturnMethodsPractice2 {
    /*
    calculate the grade of the student based on the score
     */
    public static void main(String[] args) {

        System.out.println(gradeScore(78));


    }
public static String gradeScore(int score){
    String grade="Invalid";
    if (score>=0 && score<=100){
        grade=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
    }
    return grade;



}


}
