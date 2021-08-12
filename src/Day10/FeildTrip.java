package Day10;

import sun.font.DelegatingShape;

public class FeildTrip {
    public static void main(String[] args) {
        /*
        Your school goes on a Field trip each year. The place you go will be based on your grade. Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.

                Data based on grade:

                    grade - 1
                    location -  Apple orchard
                    number of groups - 3
                    teacher in charge - Ms. Smith

                    grade - 2
                    location - Zoo
                    number of groups - 7
                    teacher in charge - Mr. Lee

                    grade - 3
                    location - Aquarium
                    number of groups - 5
                    teacher in charge - Ms. Wilson

                    grade - 4
                    location - Movie theater
                    number of groups - 2
                    teacher in charge - Ms. Reyes

                    grade - 5
                    location - Museum
                    number of groups - 5
                    teacher in charge - Ms. Lela

                    grade - 6
                    location - Six Flags
                    number of groups - 8
                    teacher in charge - Mr. Watt
         */
        int grade=4;
        String location="";
        int group=0;
        String teacher="";
        if (grade>=1 && grade<=6){
         if (grade==1){
             group=3;
             location="Apple Orchard";
             teacher="Ms. Smith";
         }else if (grade==2){
             group=7;
             location="zoo";
             teacher="Mr.Lee";
         }else if (grade==3){
             group=5;
             location="aquarium";
             teacher= "Mr. Wilson";
         }else if (grade==4){
             group=2;
             location= " movie theatre";
             teacher="Mr. Reyes";
         }else if (grade==5){
             group=5;
             location="museum";
             teacher= "Ms. Leyla";
         }else{
             group=8;
             location="SIx Flags";
             teacher="Mr. Watt";
         }

        }else {
            location="unknown";
            teacher="unknown";
            group=0;
            //System.out.println("there is no field trip for you");
        }
        System.out.println("grade: "+ grade);
        System.out.println("location: "+ location);
        System.out.println("group: "+ group);
        System.out.println("teacher: "+ teacher);

    }
}
