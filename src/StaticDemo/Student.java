package StaticDemo;

public class Student {
    public int id;
    public String Name;
    public int age;
    public float psp;
    public static String CourseName;
    public static String CollegeName="Static College";
    public String DiaplayName()
    {
        return Name;
    }
    public int DisplayId()
    {
        return id;
    }
    public String DisplayCollegeName()
    {
        return CourseName;
    }
}
