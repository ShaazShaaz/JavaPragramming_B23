package day11;

public class EntranceTernary {
    public static void main(String[] args) {
        /*
        Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY
         */
        String sport= "Golf";
        int fee=(sport=="Soccer" || sport=="Tennis")?100:50;

        System.out.println(fee);
        System.out.println("---------------------");

        /*
        write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with different values: n1 , n2 and n3
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         NOTE: MUST APPLY TERNARY
         */
        int n1=100,
            n2= 200,
            n3=300;
        String result2=(n1>n2 && n1>n3)?n1+ " is biggest":(n2>n1 && n2>n3)?n2+" is biggest":n3+" is biggest";
        System.out.println(result2);

        System.out.println("-------------");

        int number=13;
        String name="";
        // make pre condition number1-12

        if (number>=1 && number<=12){

          name=(number==1)? "Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"April":(number==5)?"May"
                  :(number==6)?"June":(number==7)?"July":(number==8)?"August":(number==9)?"September":
                  (number==10)?"October":(number==11)?"November":"December";

        }else {
            name="Invalid";
        }
        System.out.println(name);



    }
}
