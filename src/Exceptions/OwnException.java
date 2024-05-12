package Exceptions;

public class OwnException {
    static boolean SignUp(String email) throws InvalidEmailExceptionChecked {
        if(email.length()<5)
            //Here InvalidEmailException is not predefined exception and we need to create on our own
            throw new InvalidEmailExceptionChecked();
        return true;
    }
    static boolean EmailValidator(String email) {
        if(email.length()<5)
            //Here InvalidEmailException is not predefined exception and we need to create on our own
            throw new InvalidEmailExceptionRuntime();
        return true;
    }


    public static void main(String[] args) throws InvalidEmailExceptionChecked {
        System.out.println("Login Success "+SignUp("YAMINI"));
        System.out.println("Email Validation "+EmailValidator("YAMINI"));
        System.out.println("Login Success "+SignUp("YAMI"));//when ann exception occres the execution will stop there itself, So here next line will not execute
        System.out.println("Email Validation "+EmailValidator("YAMI"));

    }
}
