package FunctionslInterfaceDemo;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        /*WAY 1:
         We cannot create instance of interface (Reason:Interfaces are not complete on their own,
        They can have abstract methods
         */
        DemoClass way1=new DemoClass();
        way1.fun1();
        /* WAY2:
        Anonymous class Intro:
        In WAY1 we are doing many extra things
        1.DemoInterface-> Has one abstract method
        2.DemoClass->Simply overriding the abstract method(which comes from DemoInterface)
        -> This is redundant we can get away with this without creating DemoClass
         */
        DemoInterface way2=new DemoInterface() {
            @Override
            public void fun1() {
                System.out.println("Anonymous function implementation of fun1");
            }
        };
        way2.fun1();
        /*WAY3 : ********LAMBDA EXAMPLE****************
        * In Way2 also we are doing extra things*
        * You are only passing a function on the right side above, nothing else
        *For this you have a lot of boiler plate code and we can Remove this.
         */
        /*
        * method
        * input: we are not [assing any input in above example
        * body:System.out.println("Anonymous function implementation of fun1");
         */
        DemoInterface way3=()->{
            System.out.println("Implementing fun1 using lambda");
        };
        way3.fun1();
        /************* PREDICATE FUNCTIONAL INTERFACE**************/
        /***** PREDICATE DEMO using Anonymous Function*******/
        Predicate<String> predicate=new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length()>10)
                    return true;
                return false;
            }
        };

        System.out.println("Predicate Functional interface demo using Anonymous class  "+
                predicate.test("ScalarScalar"));

        /***** PREDICATE DEMO using LAMBDA Function*******/
        Predicate<String> predicateLambda=(str)->{
            if(str.length()>10)
                return true;
            return false;

        };
        System.out.println("Predicate Functionsl interface demo using LAMBDA Function  "
                +predicateLambda.test("YAMINI"));
        /************* BiFunction FUNCTIONAL INTERFACE**************/
        /***** BiFunction DEMO using Anonymous Function*******/
        BiFunction<String,String,Integer> biFunction=new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s, String s2) {
                return (s+s2).length();
            }
        };
        System.out.println("BiFunction Using Anonymous Function  "
                +biFunction.apply("Yamini", "Manga"));
        /***** BiFunction DEMO using LAMBDA Function*******/
        BiFunction<String,String,String> biFunctionLambda=(str1,str2)->{
            return str1+str2;

        };
        /* We are specifying return explicitly in above code but here no need to mention
        * as when we go into BiFunction Interface we could see it is going to return data of type
        * 3rd parameter. But the below approach is not that much recommedable because it is difficult
        * to understand. But still its fine if we use so*/
        BiFunction<String,String,String> biFunctionLambdav1=(str1,str2)->str1+str2;

        System.out.println("BiFunction Using LAMBDA FUNCTION  "
                +biFunctionLambda.apply("Yamini", "Manga"));

        System.out.println("BiFunction Using LAMBDA FUNCTION  "
                +biFunctionLambdav1.apply("Yamini", "MangaV1"));

        /******** Runnable Interface Using LAMBDA Function *****************/




    }
}
