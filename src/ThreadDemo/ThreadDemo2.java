package ThreadDemo;

public class ThreadDemo2 extends Thread {

    @Override
    public void run() {
        System.out.println("Implementing own Thread class"+Thread.currentThread().getName());

    }
}
