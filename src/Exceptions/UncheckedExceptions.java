package Exceptions;

public class UncheckedExceptions {
    static void doSomething(int rollNo)  {
        if (rollNo>10)
        {
            System.out.println("Student Details");
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void main(String[] args)  {
        doSomething(9);
    }
}
