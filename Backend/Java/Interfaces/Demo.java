interface A
{
    String name = "Rajesh";  //Every variable declared in interface are final and static
    int age = 26;

    void show();
    void config();
}

class B implements A
{
    public void show()
    {
        System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In Config");
    }
}

public class Demo
{
    public static void main(String[] args) 
    {
        A obj;
        obj = new B();

        obj.show();
        obj.config();


    }
}