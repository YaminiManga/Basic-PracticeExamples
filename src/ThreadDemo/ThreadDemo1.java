package ThreadDemo;

public class ThreadDemo1 implements Runnable{
    @Override
    public void run() {
        System.out.println("First Thread program"+Thread.currentThread().getName());

    }
}
