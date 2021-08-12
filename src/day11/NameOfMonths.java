package day11;

public class NameOfMonths {
    public static void main(String[] args) {
             int number=20;
             String name="";

             switch (number){
                 case 1:
                     name="Jan";
                     break;
                 case 2:
                     name="Feb";
                     break;
                 case 3:
                     name="March";
                     break;
                 case 4:
                     name="April";
                     break;
                 case 5:
                     name="May";
                     break;
                 case 6:
                     name="June";
                     break;
                 case 7:
                     name="July";
                     break;
                 case 8:
                     name="August";
                     break;
                 case 9:
                     name="September";
                     break;
                 case 10:
                      name="October";
                      break;
                      case 11:
                          name="Nov";
                          break;
                 default:
                     name="No such month";
                     break;


             }
        System.out.println(name);





    }
}
