package day41_CustomClass_Constructor.ScrumMaster;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1=new Tester("Shaz",'F',"SDET",120000,1234);
        Tester tester2=new Tester("Abbos",'M',"SM",110000,1235);
        Tester tester3=new Tester("Ahmet",'M',"SM",130000,1236);
        Tester[] testers={tester1,tester3};
        Developer dev1=new Developer("Zorana",'F',"SD",120000,12);
        Developer dev2=new Developer("Mehmet",'M',"SD",120000,13);
        Developer dev3=new Developer("Shaaz",'F',"JD",125000,14);
        Developer[] developers={dev1,dev2};

        ScrumTeam team1=new ScrumTeam("Shazia","Phillip","Aysu");
        team1.hireDeveloper(dev2);
        team1.hireTester(tester2);
        team1.hireTester(testers);
        team1.hireDeveloper(developers);

        System.out.println(team1);
        System.out.println("-------------------------------");

        double budget=0;
        for (Tester each:team1.testers){
            System.out.println(each);
            budget+=each.salary;
        }

        for (Developer eachDev:team1.developers){
            budget+=eachDev.salary;
        }

        System.out.println(budget);


        ScrumTeam team2=new ScrumTeam("Ahmet","Olcay","Beyza");// add 5 testers and 6 developers
        ScrumTeam team3=new ScrumTeam("Azra","Zara","Senol");// add 2 testers and 4 developers

        ScrumTeam[] scrumTeams= {team1,team2,team3}; // contains all testers n devlps

        // find the overall budget of scrumTeams
        // total num of testers in BOA
        // total num of developers in BOA
        // max and min salary of testers
        // max and min salary of developers

        double totalBudget=0;
        for (ScrumTeam eachTeam:scrumTeams){
            for (Tester eachTester:eachTeam.testers){
                totalBudget+=eachTester.salary;
            }
            for (Developer eachDev:eachTeam.developers){
                totalBudget+=eachDev.salary;
            }
        }
        System.out.println(totalBudget);
        System.out.println(tester1);
        System.out.println(tester2.isEmployed);// will run but warning cuz static method should be called by class



        int numOfTesters=0;
        int numOfDev=0;
        for (ScrumTeam eachTeam:scrumTeams){
            numOfTesters+=eachTeam.testers.size();
        }
        for (ScrumTeam each:scrumTeams){
            numOfDev+=each.developers.size();
        }
        System.out.println(numOfTesters);
        System.out.println(numOfDev);
        System.out.println("------------------------------");

        double maxSalaryTester=0;
        double minSalaryTester=Double.MAX_VALUE;
        double maxSalaryDeveloper=0;
        double minSalaryDeveloper=Double.MAX_VALUE;
        String d1="",d2="",t1="",t2="";


        for (ScrumTeam eachTeam:scrumTeams){
            for (Tester each:eachTeam.testers){
                if (each.salary>maxSalaryTester){
                    // even use Math class: maxSalaryTester=Math.max(each.salary,maxSalaryTester)
                    maxSalaryTester=each.salary;
                    t1=each.name;
                }
                if (each.salary<minSalaryTester){
                    // even use Math class: minSalaryTester=Math.min(each.salary,minSalaryTester)
                    minSalaryTester=each.salary;
                    t2=each.name;
                }
            }
            for (Developer each:eachTeam.developers){
                // even use Math class: maxSalaryDeveloper=Math.max(each.salary,maxSalaryTester)
                if (each.salary>maxSalaryDeveloper){
                    maxSalaryDeveloper=each.salary;
                    d1=each.name;
                }
                if (each.salary<minSalaryDeveloper){
                    minSalaryDeveloper=each.salary;
                    d2=each.name;
                }
            }
        }
        System.out.println(maxSalaryTester);
        System.out.println(maxSalaryDeveloper);
        System.out.println(minSalaryTester);
        System.out.println(minSalaryDeveloper);
        System.out.println(t1+ " "+t2);
        System.out.println(d1+" "+d2);


    }
}
