package Day24Array;

public class Grade {
    public static void main(String[] args) {
        /*
        given the following arrays:
     String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];
         write a program that can store the grades of the students in the array named grades
         */
        String[] names={"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char[] grades=new char[names.length];
        for (int i = 0; i <= scores.length-1; i++) {

           if (scores[i]>=90){
               grades[i]='A';
           }

        }



    }
}
