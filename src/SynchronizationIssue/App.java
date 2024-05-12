package SynchronizationIssue;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value=new Value();
        AdderNormal adderNormal=new AdderNormal(value);
        SubtractorNormal subtractorNormal=new SubtractorNormal(value);
        ExecutorService es=Executors.newCachedThreadPool();
        Future<Void> adderNormalFuture=es.submit(adderNormal);
        Future<Void> subtractorNormalFuture=es.submit(subtractorNormal);
        adderNormalFuture.get();
        subtractorNormalFuture.get();
        System.out.println(Value.value);


        es.shutdown();
    }
}
