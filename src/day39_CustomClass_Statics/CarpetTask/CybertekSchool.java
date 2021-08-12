package day39_CustomClass_Statics.CarpetTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class CybertekSchool {
    public static void main(String[] args) {
        Student[] group1={new Student(),new Student(),new Student(),new Student(),new Student(),
                new Student(),new Student(),new Student(),new Student(),new Student()};
        group1[0].setInfo("John",'M','B', LocalDate.of(1990,2,25),11);
        Student[] group2={new Student(),new Student(),new Student(),new Student(),new Student(),
                new Student(),new Student(),new Student(),new Student(),new Student(),new Student()};
        Student[] group3={new Student(),new Student(),new Student(),new Student(),new Student(),
                new Student(),new Student(),new Student(),new Student(),new Student(),new Student(),new Student()};


        Student[][] groups={group1,group2,group3};
        ArrayList<Student> firstMarketGroup=new ArrayList<>(); // grade must be A
        ArrayList<Student> secondMarketGroup=new ArrayList<>(); // B
        ArrayList<Student> thirdMarketGroup=new ArrayList<>();  // below B

        for (Student[] eachGroup:groups){
            for (Student eachStudent:eachGroup){
                if (eachStudent.grade=='A'){
                    firstMarketGroup.add(eachStudent);
                }else if (eachStudent.grade=='B'){
                    secondMarketGroup.add(eachStudent);
                }else {
                    thirdMarketGroup.add(eachStudent);
                }

            }
            System.out.println("Market group1: "+firstMarketGroup.size());
            System.out.println("Market group2: "+secondMarketGroup.size());
            System.out.println("Market group3: "+thirdMarketGroup.size());
        }
        // who is the youngest of the firstmarketgroup
        LocalDate min=firstMarketGroup.get(0).dateOfBirth;




        // who is the youngest avenger
        // display the name of students born between 1985-Jan-20 to 1995-Aug-15






    }
}
