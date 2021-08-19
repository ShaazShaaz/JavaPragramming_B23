package day47_Recap.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        IPhone iphone=new IPhone("12","Large","Black",1100);
        iphone.call(911,912);
        iphone.text(922);
        iphone.faceTime(933);
        System.out.println(iphone);
        System.out.println("-----------------------------");
        Samsung samsung=new Samsung("galaxy s6","extra large","white",1000);
        samsung.call(944);
        samsung.text(123,124,125,126);
        System.out.println(samsung);
        System.out.println("-----------------------------");
        Nokia nokia=new Nokia("Brick","small","Grey",50);
        nokia.selfDefense();
        nokia.setColor("pink");
        System.out.println(nokia);
    }
}
