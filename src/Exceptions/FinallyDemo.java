package Exceptions;


public class FinallyDemo {
    static void RegisterUser(String name,int Psp) throws NameException,PSPException {
        if(name.length()<5)
        {
            throw new NameException();
        }
        if(Psp<50)
        {
            throw new PSPException();
        }


    }

    public static void main(String[] args)  {
        try {
            RegisterUser("YAMI", 40);
        }

        catch(PSPException pe)
            {
                System.out.println("PSP is Less , Try to improve PSP");
            }
        catch(NameException e)
        {
            System.out.println("Name is not correct  , CHECK ONCE");
        }


        finally{
            System.out.println("SUCCES.............");

        }


    }

}
