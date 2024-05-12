package ThreadLocking;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class AdderNormal implements Callable<Void> {
    Value val;
    Lock lock;

    AdderNormal(Value val,Lock lock)
    {
        this.val=val;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<10; i++)
        {
            lock.lock();
            val.value+=i;
            System.out.println("Added" +i);//To check whether they are working parallely or not
            lock.unlock();
        }
        return null;
    }
}
