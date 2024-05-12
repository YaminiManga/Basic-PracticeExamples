package PracticeExamples;

public class App {

    public static void main(String args[])
    {
        // **********Shallow and DeepCopyExample***************
        ABC shallowCopy=new ABC();
        ABC shallowCopy1=shallowCopy;
        shallowCopy1.number2=20;
        System.out.println(" Shallow Copy SD Object");
        System.out.println("number1 is "+shallowCopy.number+" number2 is "+shallowCopy.number2);
        System.out.println(" Shallow Copy SD2 Object");
        System.out.println("number1 is "+shallowCopy1.number+" number2 is "+shallowCopy1.number2);
        //DeepCopyExample
        ABC deepCopy=new ABC();
        ABC deepCopy1=new ABC();
        deepCopy1.number2=20;
        System.out.println("Deep Copy SD Object");
        System.out.println("number1 is "+deepCopy.number+" number2 is "+deepCopy.number2);
        System.out.println("Deep Copy SD2 Object");
        System.out.println("number1 is "+deepCopy1.number+" number2 is "+deepCopy1.number2);

        Student s1=new Student(1,"YAMINI",10);
        Student s2=new Student();
        s2.id=s1.id;
        s2.name=s1.name;
        s2.age=s1.age;
        System.out.println("S1 id "+s1.id+"s1 name "+s1.name+"s1 age "+s1.age);
        System.out.println("S1 id "+s2.id+"s1 name "+s2.name+"s1 age "+s2.age);

        s2.name="YAMINI MANGA";
        s2.age=100;


    }
}
