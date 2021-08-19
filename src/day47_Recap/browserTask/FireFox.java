package day47_Recap.browserTask;

public final class FireFox extends Browser{

    @Override
    public void open() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox Browser");
    }
}
