package AbstractUsage;

public class Circle extends Shape{

    public Circle(int radius) {
        super(radius);
    }

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    int area() {
       return 2*radius;
    }
    public void display()
    {
        System.out.println("This is  Circle Class display method");
    }
}
