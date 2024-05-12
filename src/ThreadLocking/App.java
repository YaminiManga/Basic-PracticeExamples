package ThreadLocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value=new Value();
        /*ReentrantLock is a inbuilt class in java which gives you a way to acquire the lock*/
        Lock lock=new ReentrantLock(true);
        AdderNormal adderNormal=new AdderNormal(value,lock);
        SubtractorNormal subtractorNormal=new SubtractorNormal(value,lock);
        ExecutorService es=Executors.newCachedThreadPool();
        Future<Void> adderNormalFuture=es.submit(adderNormal);
        Future<Void> subtractorNormalFuture=es.submit(subtractorNormal);
        adderNormalFuture.get();
        subtractorNormalFuture.get();
        System.out.println("Final Result  "+Value.value);


        es.shutdown();
    }
}
