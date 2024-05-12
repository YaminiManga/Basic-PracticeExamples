package Exceptions;

public class CheckedExceptions {
    static void doSomething(int rollNo) throws ClassNotFoundException {
        if (rollNo>10)
        {
            System.out.println("Student Details");
            return;
        }
        throw new ClassNotFoundException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        doSomething(11);
    }
}
