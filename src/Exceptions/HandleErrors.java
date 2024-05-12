package Exceptions;

public class HandleErrors {
    //We can handle errors but it is not a good idea, In this we are just seeing example of how to handle it
    //because if we handle it is like we are silencing goodperson who is raising his voice against bad things
    // as these are issues in our code we shouldn't handle and just throw out
    static void doubler(int a)
    {
        doubler(a*2);
    }

    public static void main(String[] args) {
        try{
            doubler(2);
        }
        catch(StackOverflowError e)
        {
            System.out.println("StackOverFlowError");
        }

    }
}
