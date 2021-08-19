package day47_Recap.phoneTask;

public final class IPhone extends Phone{
    /*
    create the following custom final classes:
    1. iPhone:
            variables: brand, model, size, price, color
            methods: call(), text(), faceTime(), toString()
     */
    public IPhone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }
    public void call(long phoneNumber){
        System.out.println(getBrand()+" iPhone is calling ");
    }
    public void call(long ph1,long ph2){
        call(ph1);
        call(ph2);
    }
    public void call(long p1,long p2,long p3){
        call(p1,p2);
        call(p3);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Apple is texting to "+phoneNumber);
    }
    public final void faceTime(long number){
        System.out.println("Apple is face timing "+number);
    }



}
