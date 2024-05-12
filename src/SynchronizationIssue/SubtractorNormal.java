package SynchronizationIssue;

import java.util.concurrent.Callable;

public class SubtractorNormal implements Callable<Void> {
    Value val;
    SubtractorNormal(Value val)
    {
        this.val=val;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<5000; i++)
        {
            val.value-=i;
        }
        return null;
    }
}
