package day38_CustomClass.employeeDet;

public class Employee {
    /*
    Employees:
    Attributes:
        employeeName, gender, SSN, employeeID, JobTitle, Salary
    Actions:
        attendMeeting, Working, getInfo/toString, SetInfo
    ArrayList of employees:
        1. remove all the employees who are making lass than 100K
        2. remove all the QAs
     */
    public String name;
    public char gender;
    public int ID;
    public String jobTitle;
    public double salary;

  // to set info of employees
    public void setInfo(String name, char gender, int ID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // to print out/ get info of employees
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
