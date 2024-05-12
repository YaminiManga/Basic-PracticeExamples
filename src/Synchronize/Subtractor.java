package Synchronize;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value val;
    Lock lock;
    Subtractor(Value val,Lock lock)
    {
        this.val=val;
        this.lock=lock;
    }


    @Override
    public Void call() throws Exception {
        for(int i=1;i<=500;i++)
        {
            synchronized(Value.class)
            {
                val.value-=i;
                // System.out.println(val.value);
            }



        }
        return null;
    }
}
