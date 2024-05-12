package FunctionslInterfaceDemo;

import javax.xml.bind.annotation.XmlType;

@FunctionalInterface
public interface DemoInterface {
    public void fun1();
    public default void fun2()
    {
        System.out.println("This is DEFAULT method");
    }
    public static void fun3()
    {
        System.out.println("This is STATIC method in DemoInterface");
    }
}
