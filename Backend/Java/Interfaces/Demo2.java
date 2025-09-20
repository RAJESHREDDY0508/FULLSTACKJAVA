
//class-class -> extends
//class -interface -> implements
//Interface - interface -> extends



interface  A
{
    void show();
    void config();

}
interface X
{
    void run();
}
interface Y extends X
{

}

class B implements A,Y
{
    public void show()
    {
        System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void run()
    {
        System.out.println("Running...");
    }
}





public class Demo2
{
    public static void main(String[] args) 
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        
    }
}