package Day4_Variables;

public class TaxCalculations {
    public static void main(String[] args) {
        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        // you need to pay amount of stateTax
        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary - totalStateTax- totalFederalTax;
        System.out.println("your salary is $" + salary);

        System.out.println("You need to pay $" + totalStateTax + " of StateTax");
        System.out.println("You need to pay $" + totalFederalTax + " of FederalTax");
        System.out.println("Your take home salary is $" + salaryAfterTax);



    }

}
