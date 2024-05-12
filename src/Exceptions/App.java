package Exceptions;

public class App {
    static double divide(int a,int b)
    {
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Dividing 10 by 2  "+divide(10, 2));
        System.out.println("Dividing 30 by 2  "+divide(30, 2));
        /* Arithmetic Exception - Divide by Zero*/
        System.out.println("Dividing 30 by 0  "+divide(30, 0));
    }
}
