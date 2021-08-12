package Day10;

public class SalaryAfterTax {
    public static void main(String[] args) {
        /*
        35% for salary of 130K or more
         */
        double salary= 100_000;
        double taxRate=0;
        if (salary>=130000){
            taxRate=0.35;
        }else if (salary>=100000){   // no need to write && salary<130000
            taxRate=0.30;
        }else if (salary>=80000){    // no need to write && salary<100000
            taxRate=0.25;
        }else {
            taxRate=0.20;
        }
        boolean isMarried=false;
        if (isMarried){
            taxRate-=0.05;
        }
        double salaryAfterTax= salary-(salary*taxRate);
        System.out.println(salaryAfterTax);


    }
}
