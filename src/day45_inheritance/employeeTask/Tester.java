package day45_inheritance.employeeTask;

public class Tester extends Employee {
    public Tester(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void test(){
        System.out.println(name+" loves to test");
    }
}
