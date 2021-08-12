package day39_CustomClass_Statics.CarpetTask;

public class SalaryObjects {
    public static void main(String[] args) {
       // employee- hourly= $65 , state tax= 7% , federal tax 23%, 45 hrs per week

        SalaryCalculator employee1=new SalaryCalculator();
        employee1.setInfo(65,7, 23,45);
        System.out.println(employee1);

        // employee2 : 50$/h, 5% state tax, 25% federal tax,40 hrs per week

        SalaryCalculator employee2=new SalaryCalculator();
        employee2.setInfo(50,5,25,40);
        System.out.println(employee2);





    }
}
