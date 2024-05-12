package Exceptions;

public class HandleException {
    static int count=0;
    static void divide(int a,int b) throws InvalidDivisorException, NegativeDivisorException {
        if(b==0)
        {
            throw new InvalidDivisorException();
        }
        else if(b<0)
        {
            throw new NegativeDivisorException();
        }
        else {
            System.out.println("Result  "+a/b);
        }
    }

    public static void main(String[] args) throws InvalidDivisorException {
        try{
            divide(10,-1);
        }
        catch(InvalidDivisorException e)
        {
            System.out.println("Dividing by zero Happened  "+count);
            count++;
        }
        catch(NegativeDivisorException ne)
        {
            System.out.println("Negative divisor  "+count);
            count++;

        }
        throw new InvalidDivisorException();
        //After catching also we can still throw the exception , which means we are saying when the
        // exception occured do something and after that throw it
        /* When exception occurs if we rae catching and handling then next statements will continue to execute
        if we are throwing using throw keyword then next statements of throw will not execute
         */
    }
}
