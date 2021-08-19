package day47_Recap.browserTask;

public final class Safari extends Browser{

    @Override
    public void open() {
        System.out.println("opening safari browser");
    }

    @Override
    public void close() {
        System.out.println("closing safari browser");
    }
}
