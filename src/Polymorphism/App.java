package Polymorphism;

public class App {
    public static void main(String[] args) {
        MethodOverloading.add(3,2);
        MethodOverloading.add("Yamini","Manga");
        MethodOverloading.add(5.0,7);
        Student s=new Student();
        s.display();
        User u=new User();
        u.display();
    }
}
