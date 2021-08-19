package day47_Recap.phoneTask;

public final class Samsung extends Phone{
    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println(getBrand()+"calling "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println(getBrand()+"texting "+phoneNumber);
    }
    public void text(long n1,long n2){
        text(n1);
        text(n2);
    }
    public void text(long n1,long n2,long n3){
        text(n1,n2);
        text(n3);
    }
    public void text(long n1,long n2,long n3,long n4){
        text(n1,n2,n3);
        text(n4);
    }
    public void freeze(){
        System.out.println(getBrand()+" "+getModel()+" is freezing");
    }




}
