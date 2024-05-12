package Synchronize;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value val=new Value();
        Lock lock=new ReentrantLock(true);
        Adder adder=new Adder(val,lock);
        Subtractor sub=new Subtractor(val,lock);
        ExecutorService es= Executors.newCachedThreadPool();
        Future<Void> adderFuture=es.submit(adder);
        Future<Void> subFuture=es.submit(sub);
        adderFuture.get();
        subFuture.get();
        System.out.println(Value.value);
        es.shutdown();

    }
}
