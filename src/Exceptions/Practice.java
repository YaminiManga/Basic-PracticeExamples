package Exceptions;

public class Practice  {
    static void doSomething(int a) throws PracticeException
    {
        if(a>5){
            System.out.println("Success");
            return;
        }
        throw new PracticeException();

    }

    public static void main(String[] args)  {
        try{
            doSomething(4);
        }
        catch(PracticeException e)
        {
            System.out.println("PracticeException occured");
        }

    }

}
