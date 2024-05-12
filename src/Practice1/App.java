package Practice1;

public class App {
    public static void main(String[] args) {

        Thread t1=new Thread(()->{
            for(int i=0;i<=100;i+=2)
            {
                System.out.println("EVEN NUMBER" +i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=100;i+=2)
            {
                System.out.println("ODD NUMBERS  "+i);
            }
        });
        t1.start();
        t2.start();
    }
}
