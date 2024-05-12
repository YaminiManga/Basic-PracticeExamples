package SuperDemo;

public class Dog extends Animal{
    boolean canBark;
    String Breed;

    Dog(String Name) {
        super(Name);
        canBark=true;
        Breed="ParameterizedConstructorBreed";
    }
    void Bark() {
        System.out.println("Barking");
        //System.out.println("Barking");
    }


}
