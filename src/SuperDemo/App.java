package SuperDemo;

public class App {
    public static void main(String args[])
    {
        System.out.println("Starting Execution");
        Dog d=new Dog("Doggo");
        System.out.println("Dog Breed is "+d.Breed);
        d.Bark();
        System.out.println("Dog can walk "+d.canWalk);
        d.Walk();
        System.out.println("DogName "+d.name);

    }
}
