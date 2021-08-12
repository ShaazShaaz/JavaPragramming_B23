package day39_CustomClass_Statics.CarpetTask;

import java.text.DecimalFormat;

public class SalaryCalculator {
    /*
    SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

        Actions:
            setInfo(): sets all the fields of SalaryCalculator
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): calculates the totalStateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

     */
    public double hourlyRate, stateTaxRate,federalTaxRate,weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        return "SalaryCalculator{" +
                "Salary= $" + df.format(salary()) +
                ", stateTax= $" + df.format(stateTax()) +
                ", federalTax= $" + df.format(federalTax()) +
                ", Salary after tax= $" + df.format(salaryAfterTax()) +
                '}';
    }
}
