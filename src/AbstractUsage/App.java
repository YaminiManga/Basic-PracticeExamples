package AbstractUsage;

public class App {
    public static void main(String args[])
    {
        Shape rectangle=new Rectangle(2,3);
        rectangle.draw();
        System.out.println("Rectangle Radius "+rectangle.area());
        Shape circle=new Circle(5);
        circle.draw();
        System.out.println("Circle Radius "+circle.area());
        rectangle.display();
        circle.display();


    }
}
