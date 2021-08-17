package day45_inheritance.employeeTask;

public class Developer extends Employee {
    public Developer(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void code(){
        System.out.println(name+" loves to code");
    }
    public void fixBugs(){
        System.out.println(name+" is good at fixing bugs");
    }
}
