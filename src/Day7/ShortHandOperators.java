package Day7;

public class ShortHandOperators {
    public static void main(String[] args) {

        String name1= "Muhtar";
        String name2= "Mehmet";
        String name3= name2; // name3=Mehmet

        name2=name1; // name2= "Muhtar"
       // name1=name2; // name1= Muhtar
        name1=name3; // name1= Mehmet

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);


        System.out.println("__________________________");

        int balance = 300;
        // balance = balance + 200;
        balance += 200;
        System.out.println("balance = " + balance);

        balance+= 1000;
        System.out.println("balance = " + balance);

        String school="Cybertek";
        school+= "School";
        System.out.println("school = " + school);

        String name="John";
        name += " Daniel";
        System.out.println("name = " + name);

        // withdraw money
        balance-= 300;
        System.out.println("balance = " + balance);

        balance-= 1000;
        System.out.println("balance = " + balance);

        //*
        double salary= 100000;
        // salary= salary * 2
        salary *= 2;

        System.out.println("salary = " + salary);

        // 0.65
        salary *= 0.65;
        System.out.println("salary = " + salary);

        // /= Division assignment
        int slices= 10;// 5 ppl in family
        slices /= 5;
        System.out.println("slices = " + slices);

        double slice= 10;// 10.0
        slice /= 3;
        System.out.println("slice = " + slice);

        // remainder assignment %=
        // convert 105 to 4 quarters and 5 cents
        int cents= 105;
        int quarters=cents/25;
        cents %=25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        // remainder= N-(D*whole number result)








    }
}
