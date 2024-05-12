package AbstractUsage;

public abstract  class Shape {
    public int length;
    public int width;
    public int radius;
    public Shape(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    public Shape(int radius)
    {
        this .radius=radius;
    }
    abstract void draw();
    abstract int area();
    public void display()
    {
        System.out.println("This is  Abstract Class display method");
    }

}
