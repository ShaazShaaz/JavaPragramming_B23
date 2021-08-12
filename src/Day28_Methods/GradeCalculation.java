package Day28_Methods;

public class GradeCalculation {
    /*
    calculate the grade of the student based on the score
     */
    public static void main(String[] args) {
        gradeScore(79);
    }



public static void gradeScore(int score){
    String grade="";
    if (score<0 || score>100) {
        System.out.println("invalid score");
        return; // will exit the method. can use nested if also
    }
        if (score>=90){
            grade="A";
        }else  if (score>=80){
            grade="B";
        }else if (score>=70){
            grade="C";
        }else if (score>=60){
            grade="D";
        }else {
            grade="F";
        }

    System.out.println(grade);
}



}
