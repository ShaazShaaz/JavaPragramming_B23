package Day9;

public class GradeReport {
    public static void main(String[] args) {
        int score=110;
        if (score>=90 && score<=100){
            System.out.println("A");
        }else if (score>=80 && score<90){  // option of not giving score<90 cuz 1st cond is already false
            System.out.println("B");
        }else if (score>=70 && score<80){  // opt out score<80 cuz above cond are not met
            System.out.println("C");
        }else if (score>=60 && score<70) {  // can opt out score<70 cuz the above conditions were not met
            System.out.println("D");
        }else {
            System.out.println("Failed");
        }
    }
}
