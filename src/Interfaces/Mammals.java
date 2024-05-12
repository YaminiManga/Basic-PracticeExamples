package Interfaces;

public class Mammals implements Animal{
    private String name;
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public void sleep() {
        System.out.println("Mammals are sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Mammals are eating");

    }
    public void bark()
    {
        System.out.println("Mammals are barking");
    }
}
