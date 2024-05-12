package ThreadLocking;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class SubtractorNormal implements Callable<Void> {
    Value val;
    Lock lock;
    SubtractorNormal(Value val,Lock lock)
    {

        this.val=val;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<10; i++)
        {
            lock.lock();
            val.value-=i;
            System.out.println("Subtracted"+i);
            lock.unlock();
        }
        return null;
    }
}
