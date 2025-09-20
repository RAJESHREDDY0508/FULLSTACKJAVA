
class A implements Runnable
{
    public void run()
    {
        for(int i =1; i<=5; i++){
            try {
                System.out.println("Hi");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class B implements Runnable
{
    public void run()
    {
        for(int i =1; i<=5; i++){
            try {
                System.out.println("Hello");
                Thread.sleep(9);
            } catch (InterruptedException ex) {
            }
        }
    }
}

public class RunnablevsThread
{
    public static void main(String[] args) 
    {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        
        t1.start();
        t2.start();
    }
}
