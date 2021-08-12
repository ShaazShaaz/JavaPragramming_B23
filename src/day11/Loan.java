package day11;

public class Loan {
    public static void main(String[] args) {
        /*
        Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
             double salary=90000;
             int score=720;
             String result="";
             if(salary>60000 && score>650){
                 result="Loan Approved";
             }else {
                 result="Loan Denied";
             }

         */

        double salary= 50000;
        int creditScore=740;
        String result=(salary>60000 && creditScore>650)?"Loan Approved":"Loan Denied";
        System.out.println(result);

    }
}
