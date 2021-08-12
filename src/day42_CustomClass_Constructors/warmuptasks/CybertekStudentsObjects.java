package day42_CustomClass_Constructors.warmuptasks;

public class CybertekStudentsObjects {
    public static void main(String[] args) {

       CybertekStudent student1=new CybertekStudent("Feruza",'F',20);
        CybertekStudent student2=new CybertekStudent("Shazia",'F',40);

        System.out.println(student1);
        System.out.println(student2);

        student1.attendClass();
        student2.replit();
        student1.askForBreak();




    }
}
