package Polymorphism;

public class MethodOverloading {
    static void add(int a,int b)
    {
        System.out.println("Interger Addition"+(a+b));
    }
    static void add(double a,double b)
    {
        System.out.println("Double Addition"+(a+b));
    }
    static void add(String a,String b)
    {
        System.out.println("String Addition"+(a+b));
    }


}
