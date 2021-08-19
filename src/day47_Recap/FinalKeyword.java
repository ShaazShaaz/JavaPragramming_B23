package day47_Recap;

public class FinalKeyword {

    public final void sleep(){
        System.out.println("sleep");
    }
    public int area(int l,int b){ // cannot be final cuz it has multiple implementations
        return l*b;
    }





}
