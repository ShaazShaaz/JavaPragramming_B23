package day42_CustomClass_Constructors.warmuptasks;

public class CybertekStudent {
    /*
    create a class named CybertekStudent
            Variables:
                name, gender, age, schoolName, fieldOfStudy, programmingLanguage
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                attendClass():
                replit()
                toString()
     */

    public String name;
    public char gender;
    public int age;
    public static String schoolName,fieldOfStudy,programmingLanguage;

    public CybertekStudent(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

        static{
            schoolName = "Cybertek School";
            fieldOfStudy = "IT";
            programmingLanguage = "Java";
        }

        public void attendClass(){
            System.out.println(name+" is attending class at "+schoolName);
        }

        public void replit(){
            System.out.println(name+" is working on "+programmingLanguage+" repl.its");
        }

        public void askForBreak(){
            System.out.println(name+" is asking for break");
        }

        public String toString() {
            return "CybertekStudent{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }






