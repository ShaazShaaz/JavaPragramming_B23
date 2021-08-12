package Recap;

public class RelationalOperators {
    public static void main(String[] args) {
        /*/* all conditions must be met
        1. income has to be at least 60K
        2. 2 years of work history
        3. credit score must be at least 700
        4 must be at least 18 yrs old

        name, age, work history, credit score, income
         */
        String name= "Shazia";
        int income= 100_000;
        int wH= 1;
        int cS=700;
        int age= 22;
        boolean isEligibleForLoan= income>=60_000 && wH>=2 && cS>=700 && age>=18;
        System.out.println(name + " is eligible for home loan: " + isEligibleForLoan);

        /*
        permitted to party
        >=18 or married
         */
        String n1= "Sophie";
        int age1= 40;
        boolean isMarried= false;
        boolean isPermitted= age1>=18 && isMarried==true;
        System.out.println("isPermitted = " + isPermitted);
        System.out.println(name + "is permitted to party:" + isPermitted);

        int ApplesCount=20;
        int OrangesCount=30;
        int PearsCount=30;
        boolean comp= ApplesCount<OrangesCount && OrangesCount>=PearsCount;

        System.out.println(comp);

        String outsideWeather="Shinny";
        int degree=70;
        boolean comp2= !(outsideWeather== "Rainy") && degree==70;
        System.out.println("comp2 = " + comp2);

        int b=2;
        boolean res= ++b==2 || --b==2 && --b==2;  // false    ||  true  && false
        System.out.println("res = " + res);

        boolean x= true,
                z= true;
        int y=20;
        x= (y!=10) || (z=false);    // true || false   === true
        System.out.println("x = " + x);

        double d1=20;
        double d2=80;
        double r=(d1 + d2)*25%40;// 100*25==2500%40==2   2<=20==true
        if (r<=20){
            System.out.println("true");
        }
        if (r>20){
            System.out.println("false");
        }




    }
}
