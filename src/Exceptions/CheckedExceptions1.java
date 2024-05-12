package Exceptions;

public class CheckedExceptions1 {
    /* In this example doSomethingElse() method throws checked exception that means we need to handle it or
    throw it back . Here we are not handling and throwing so we added throws keyword in method signature
     and now doSomething is calling doSomethingElse which means doSomething has a method which can throw
     exception so now doSomething() method should handle or throw the exception thrown by
     doSomethingElse() method and here we are throwing and added throws to method signature
     Now, the main method calling doSomething() which can throw exception so for main method also we added
     throws keyword to the main method signature*/
    static void doSomething(int rollNo) throws ClassNotFoundException {
        if (rollNo>10) {
            System.out.println("Student Details");
            return;
        }
        doSomethingElse();
    }
    static void doSomethingElse() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        doSomething(11);

    }
}
