package day47_Recap.browserTask;

public class BrowserObjects {
    public static void main(String[] args) {
        Chrome c1=new Chrome();
        c1.open();
        c1.close();
        c1.backward();
        c1.forward();
        c1.refresh();
        FireFox f1=new FireFox();
        f1.open();
        f1.close();
        f1.backward();
        f1.forward();
        f1.refresh();
        Safari s1=new Safari();
        s1.close();
        s1.backward();

    }
}
