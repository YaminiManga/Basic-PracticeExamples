package FunctionalInterfaceDemo1;

import FunctionslInterfaceDemo.DemoInterface;

public class App {
    public static void main(String[] args) {
        /***** Way1(Refer FunctionalInterfaeDemo Package for more details)
         * Taking help from helper class (RunnbaleDemoUsinglambda) and creating object for that class
         * and calling run method of Runnable interface
         */
        System.out.println(Thread.currentThread().getName());
        RunnbaleDemoUsinglambda obj=new RunnbaleDemoUsinglambda();
        Thread t=new Thread(obj);
        t.start();
        /************ WAY2
         * Anonymous function implementation of run() method********/
        Runnable runAnonymous=new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous function implementation of run() method  "
                 +Thread.currentThread().getName());
            }
        };
        Thread anonymousThread=new Thread(runAnonymous);
        anonymousThread.start();
        /********** WAY3
         * Implementing run() method  using LAMBDA Function*********************/
        Runnable runLambda=()->{
            System.out.println("LAMBDA function implementation of run() method  "
            +Thread.currentThread().getName());

        };
        Thread lambdaThread=new Thread(runLambda);
        lambdaThread.start();

        DemoInterface demo=new DemoInterface() {
            @Override
            public void fun1() {
                System.out.println("THis is demo interface");
            }
        };
        DemoInterface demo1=()->{

                System.out.println("This is lambda imple,mentation of demo interface");
        };



    }
}
