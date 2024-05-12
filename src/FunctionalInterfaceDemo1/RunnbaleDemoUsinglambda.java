package FunctionalInterfaceDemo1;

public class RunnbaleDemoUsinglambda implements Runnable {
    @Override
    public void run() {
        System.out.println("Helper calss implementation of run()  "+Thread.currentThread().getName());
    }
}
