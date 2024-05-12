package Callable;

import java.util.concurrent.Callable;

public class Demo implements Callable<Integer> {
    private int number;

    Demo(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
//        System.out.println(number);
//        return null;
        return number;

    }
}
