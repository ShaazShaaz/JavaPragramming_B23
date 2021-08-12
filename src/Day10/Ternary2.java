package Day10;

public class Ternary2 {
    public static void main(String[] args) {
        int number=100;
        /* String result="";

        if (number>0){

            result="Positive";
        }else if(number<0){
            result="Negative";
        }else {
            result="Zero";
        }
         */
        String result= (number>0)? "Positive": (number<0)?"Negative":"Zero";
        System.out.println(result);
        System.out.println("---------------");

        int score=100;

        /* char grade=' ';
        if (score>=90){
            grade='A';

        }else if (score>=80){
            grade='B';
        }else if (score>=70){
            grade='c';
        }else if (score>=60){
            grade='D';
        }else {
            grade='F';
        }

         */
            char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score > 70) ? 'C' : (score > 60) ? 'D' : 'F';
        System.out.println(grade);
        int x=3;
        int num=(x>=5)?x: -x;
        System.out.println(num);

        int num1=10;
        int num2=5;
        int result1=(num1>num2 && num1!=num2)?num1:num2;
        System.out.println(result1);





    }
}
