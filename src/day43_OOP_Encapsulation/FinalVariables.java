package day43_OOP_Encapsulation;

public class FinalVariables {

    private final String gender;
    public FinalVariables(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    /*  cannot change/set it cuz it has been declared as final
    public void setGender(String gender){
        this.gender=gender;
    }

     */

    public static void main(String[] args) {
     final int a=100;
    // a=200; gives COMPILE ERROR  cuz final keyword makes the variable constant
        System.out.println(a);






    }



}
