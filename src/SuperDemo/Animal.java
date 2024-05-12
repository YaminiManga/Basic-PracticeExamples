package SuperDemo;

public class Animal {
    boolean canWalk=true;
    String name="SomeAnimal";

    Animal(String givenName)
    {
        canWalk=true;
        name=givenName;
    }
    void Walk()
    {
        System.out.println("Animal is walkingh");
    }
}
