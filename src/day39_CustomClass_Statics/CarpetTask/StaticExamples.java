package day39_CustomClass_Statics.CarpetTask;

public class StaticExamples {
    public static void main(String[] args) {
        CybertekStudent student1=new CybertekStudent();
        student1.schoolName="Cybertek School";
        System.out.println(student1.schoolName);

        CybertekStudent student2=new CybertekStudent();
        CybertekStudent student3=new CybertekStudent();
        CybertekStudent student4=new CybertekStudent();

        System.out.println(student2.schoolName);
        System.out.println(student3.schoolName);
        System.out.println(student4.schoolName);

        System.out.println(student2.programmingLanguage);
        System.out.println(student3.programmingLanguage);
        System.out.println(student4.programmingLanguage);

        System.out.println(CybertekStudent.schoolName);
        System.out.println(CybertekStudent.programmingLanguage);

        System.out.println(student1.age); // object variables should be called from the object
       // System.out.println(CybertekStudent.age); error.


    }
}
