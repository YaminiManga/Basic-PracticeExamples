package FinalDemo;

public class Student extends User
{

    public String type="STUDENT";
    public Student(int id,String Name)
    {
        super(id,Name);
    }
    //  The below method will throw error because we declared displyUser() method as final in the parent
    //class User
//    public void displayUser()
//    {
//        System.out.println("Hello Student");
//    }

}
