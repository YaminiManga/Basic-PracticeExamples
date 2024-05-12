package Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    static int sum=0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for(int i=0;i<=3;i++)
        {
            Demo d1=new Demo(i);
            ExecutorService es= Executors.newCachedThreadPool();
            Future<Integer> future=es.submit(d1);
            sum=sum+future.get();
        }
System.out.println(sum);


    }
}
