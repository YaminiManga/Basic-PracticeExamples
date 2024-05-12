package Synchronize;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value val;
    Lock lock;
    Adder(Value val,Lock lock)
    {
        this.val=val;
        this.lock=lock;
    }


    @Override
    public Void call() throws Exception {
        for(int i=1;i<=500;i++)
        {
            synchronized(Value.class) {
            val.value+=i;
            }

        }
        return null;
    }
}
