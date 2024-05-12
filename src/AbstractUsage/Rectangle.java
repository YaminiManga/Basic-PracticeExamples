package AbstractUsage;

public class Rectangle extends Shape{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    int area() {
       return length*width;
    }
    public void display()
    {
        System.out.println("This is  rectangle  Class display method");
    }

}
