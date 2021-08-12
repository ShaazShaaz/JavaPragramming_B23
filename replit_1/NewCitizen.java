import java.util.Scanner;

public class NewCitizen {
    public static void main(String[] args) {
        /*
        Declare int variables: seniorCitizens, nonSeniorCitizens, age
Create a Scanner object
Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
"Enter current count for seniorCitizens and nonSeniorCitizens:"
Ask user to enter age:
"What is new citizen's age?"
if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.
if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.
Last print another message:
"New seniorCitizens count ValueOfVariable"
"New nonSeniorCitizens count ValueOfVariable"
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens= scan.nextInt();
        int nonSeniorCitizens=scan.nextInt();
        System.out.println("What is new citizen's age?");
        int age=scan.nextInt();
        String result="";
        if (age>=65){
            result="Senior Citizen";
            seniorCitizens+=1;
        }else if (age<65){
            result="Non-Senior Citizen";
            nonSeniorCitizens+=1;
        }
        System.out.println(result);
        System.out.println("New SeniorCitizens count "+seniorCitizens);
        System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);


    }
}
