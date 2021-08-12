package day11;

public class NestedIf {
    public static void main(String[] args) {
        /*
         In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        First figure out is is a US batch or EU batch
            - for US batches:
                    > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

            - for EU batches:
                > print: Class times are  10-5 EST. M, T, W, Th, F.

              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF
         */
        String batch="US morning";
        boolean isValid=batch=="US morning" || batch=="US evening" || batch=="EU";
        String result="";
        if(isValid){
            if (batch=="US morning"){
                result="10am-5pm EST M,T,Th,F";
            }else if(batch=="US evening"){
                result="7pm-10pm EST M.T.W.Th.S.S";
            }else {
                result="10am-5pm EST M.T.W.Th.F";
            }


        }else {
            result="invalid";
        }
        System.out.println(result);
        System.out.println("-------------------");

        /*
        write a program that can define the age groups of a person
        note: apply nested if
        Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

         */
        int age=45;
        String ageGroup="";
        if (age>=0 && age<=150){
            if (age<21){
                ageGroup="Teenage";
            }else if (age>=21 && age<55){
                ageGroup="Adult";
            }else {
                ageGroup="Senior";
            }
            System.out.println(ageGroup);


        }










    }
}
