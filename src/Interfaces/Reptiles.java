package Interfaces;

public class Reptiles implements Animal{
    public String name="Reptiles";
    @Override
    public void sleep() {
        System.out.println(" Reptiles are sleeping");
    }

    @Override
    public void eat() {
        System.out.println(" Reptiles are eating");

    }
}
