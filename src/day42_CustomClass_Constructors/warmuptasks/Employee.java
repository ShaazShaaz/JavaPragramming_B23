package day42_CustomClass_Constructors.warmuptasks;

public class Employee {
    /*
     Class Name: Employee
			instance variables:
					name, jobTitle, id, salary
			1st constructor: initializes the name ONLY
			2nd constructor: initializes name & jobTitle
						(MUST use constructor call to set the name)
			3rd Constructor: initializes name, jobTitle and id
						(MUST use constructor call to set the name & jobTitle)
			4th Constructor: initializes all the instances
						(MUST use constructor call to set the name, jobTitle, and id)
			instance methods: toString()
     */

    public String name,jobTitle;
    public int id;
    public double salary;
    /*
    public Employee(){
        name="unknown";  // everything else will be null.. can choose to avoid this default constructor
    }

     */

    public Employee(String name) {
        this.name = name;
        /*
        jobTitle="unknown";
        id=-1;
        salary=100000;
        if u set the default values, in object class, it will print these instead of null
         */
    }

    public Employee(String name, String jobTitle) {
        this(name);  // same as this.name=name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTittle, int id) {
       this(name, jobTittle); // same as this.name=name; this.jobTitle=jobTitle;
        this.id = id;
    }

    public Employee(String name, String jobTittle, int id, double salary) {
       this(name, jobTittle, id);
        this.salary = salary;
    }
    // CAN CALL ONLY 1 CONSTRUCTOR INSIDE A CONSTRUCTOR


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTittle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
