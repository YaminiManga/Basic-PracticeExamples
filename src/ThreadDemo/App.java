package ThreadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String args[]) {
//        Runnable x=new ThreadDemo1();
//        x.run();
//        Runnable x1=new ThreadDemo2();
//        Thread t=new Thread(x1);
//        t.start();
//        System.out.println(Thread.currentThread().getName());
        /*****NumberPrinter*********/

//        for(int i=0;i<=100;i++)
//        {
//            NumberPrinter np=new NumberPrinter(i);
//            Thread numberprinterThread=new Thread(np);
//            numberprinterThread.start();
//        }
        /*****Fixed Thread Pool*********/
//        ExecutorService es=Executors.newFixedThreadPool(10);
//        for(int i=0;i<=100;i++)
//        {
//            NumberPrinter np=new NumberPrinter(i);
//            es.execute(np);
//        }
        /***********Cached ThreadPool******/
        for (int i = 1; i <= 10000; i++) {
            NumberPrinter number = new NumberPrinter(i);
            ExecutorService ex = Executors.newCachedThreadPool();
            ex.execute(number);
        }



    }
}