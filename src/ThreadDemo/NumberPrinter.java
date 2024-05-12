package ThreadDemo;

public class NumberPrinter implements Runnable{
    public int number;
    NumberPrinter(int value)
    {
        number=value;
    }


    @Override
    public void run() {
        System.out.println("Number"+number+Thread.currentThread().getName());

    }
}
