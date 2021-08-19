package day47_Recap.browserTask;

public final class Opera extends Browser{
    @Override
    public void open() {
        System.out.println("opening Opera browser");
    }

    @Override
    public void close() {
        System.out.println("closing opera browser");
    }
}
