package Day12;

public class Grade {
    public static void main(String[] args) {
        /*
        a char variable named grade is given. use switch statement to print the following messages:
                if the grade is 'A' print excellent
                if the grade is 'B' print great job
                if the grade is 'C' print good
                if the grade is 'D' print passed
                if the grade is 'F' print failed
                other wise print invalid
         */
        char grade='D';
        String result="";
        switch (grade){
            case 'A':
                result="excellent";
                break;
            case 'B':
                result="great job";
                break;
            case 'C':
                result="good";
                break;
            case 'D':
                result="passed";
                break;
            case 'F':
                result="failed";
                break;
            default:
                result="invalid";

        }
        System.out.println(result);



    }
}
