package Day4_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        String lastName="King";
        String firstName= "Aron";
        String fullName= firstName+ " "+lastName;
        String gender= "Male";
        int age= 24;
        String companyName = "Microsoft";
        String jobTitle= "SDET";

        boolean isFullTime= true;
        boolean isMarried= false;
        int salary = 100000;

        System.out.println( "Employee's full name is: "+fullName);
        System.out.println(fullName+ " is "+ gender);
        System.out.println(fullName +" is "+ age +" years old");
        System.out.println(fullName + " works at " + companyName );
        System.out.println(fullName+ " is an " + jobTitle);
        System.out.println(fullName + " is on fulltime:"+ isFullTime);
        System.out.println(fullName + " is married:"+ isMarried);
        System.out.println(fullName + " is making " + salary + " dollars.");



    }
}
