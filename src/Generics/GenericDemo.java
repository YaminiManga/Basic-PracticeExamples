package Generics;

public class GenericDemo<T> {
    public void doSomething(T num1)
    {
        System.out.println(num1);
    }
    public static void main(String[] args) {
        GenericDemo<Integer> add=new GenericDemo<>();
        add.doSomething(1);
        GenericDemo<String> obj2=new GenericDemo<>();
        obj2.doSomething("Yamini");



    }

}

