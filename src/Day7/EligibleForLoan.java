package Day7;

public class EligibleForLoan {
    public static void main(String[] args) {
        /* all conditions must be met
        1. income has to be at least 60K
        2. 2 years of work history
        3. credit score must be at least 700
        4 must be at least 18 yrs old

        name, age, work history, credit score, income
         */
        String name="Shazia";
        int age= 24;
        int yrsOfWorkHistory= 3;
        int creditScore= 630;
        double income= 70000.00;

        boolean isEligibleForLoan= age>=18 && yrsOfWorkHistory>=2 && income>=60000 && creditScore >=700;
        //                          24>=18        3>=2                70000.00>=60000    630>=700
        //                             T           T                      T                 F
        //                                             FALSE

        System.out.println(name + " is eligible for loan: " + isEligibleForLoan);



    }
}
