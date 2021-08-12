package day41_CustomClass_Constructor.ScrumMaster;

public class Developer {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;
    public int id;

    public static boolean isEmployed;
    public static boolean hatesTesters;
    static {
        isEmployed=true;
        hatesTesters=true;
    }

    public Developer(String name, char gender, String jobTitle, double salary, int id) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public void fixingBugs(){
        System.out.println(name+" is crying");
    }
}
