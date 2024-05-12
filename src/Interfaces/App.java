package Interfaces;

public class App {
        public static void main(String[] args) {
            Animal m=new Mammals();
            ((Mammals) m).setName("mammals");
            System.out.println("Name is "+((Mammals) m).getName());
            m.eat();
            m.sleep();
            ((Mammals) m).bark();
            Reptiles r=new Reptiles();
            System.out.println("Reptiles name is "+r.name);


        }
    }

